package cn.mldn.service;

import java.util.List;

import cn.mldn.dto.DeptDTO;

public interface IDeptService {
	public DeptDTO add(DeptDTO dto) ;
	public DeptDTO get(long deptno) ;
	public List<DeptDTO> list() ;
}
