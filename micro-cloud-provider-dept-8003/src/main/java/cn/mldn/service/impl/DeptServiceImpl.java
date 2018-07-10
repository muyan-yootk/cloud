package cn.mldn.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mldn.dao.IDeptDAO;
import cn.mldn.dto.DeptDTO;
import cn.mldn.po.Dept;
import cn.mldn.service.IDeptService;
@Service
public class DeptServiceImpl implements IDeptService {
	@Autowired
	private IDeptDAO deptDAO ;
	@Override
	public DeptDTO add(DeptDTO dto) {
		Dept po = new Dept() ; // 创建PO类对象
		BeanUtils.copyProperties(dto, po);	// 进行类对象属性的拷贝
		DeptDTO returnDTO = new DeptDTO() ;
		BeanUtils.copyProperties(this.deptDAO.save(po), returnDTO);
		return returnDTO ;
	}

	@Override
	public DeptDTO get(long deptno) {
		Optional<Dept> opt = this.deptDAO.findById(deptno) ;
		DeptDTO returnDTO = null ;
		if (opt.isPresent()) {
			returnDTO = new DeptDTO() ;
			BeanUtils.copyProperties(opt.get(), returnDTO);	
		} 
		return returnDTO ; 
	}

	@Override
	public List<DeptDTO> list() {
		List<Dept> allPos = this.deptDAO.findAll() ;
		List<DeptDTO> allDtos = new ArrayList<DeptDTO>() ;
		allPos.forEach((dept)->{
			DeptDTO dto = new DeptDTO() ;
			BeanUtils.copyProperties(dept, dto);
			allDtos.add(dto) ;
		});
		return allDtos;
	}

}
