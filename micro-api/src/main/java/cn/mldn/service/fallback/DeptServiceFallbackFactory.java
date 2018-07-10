package cn.mldn.service.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cn.mldn.dto.DeptDTO;
import cn.mldn.service.IDeptService;
import feign.hystrix.FallbackFactory; 
@Component
public class DeptServiceFallbackFactory implements FallbackFactory<IDeptService> {
	@Override
	public IDeptService create(Throwable cause) {
		return new IDeptService() {

			@Override
			public DeptDTO add(DeptDTO dto) {
				DeptDTO returnDto = new DeptDTO() ;
				returnDto.setDeptno(-99L);
				returnDto.setDname("【Hystritx-Fallback】没有部门信息");
				returnDto.setLoc("【Hystritx-Fallback】没有部门位置");
				return returnDto ;
			}

			@Override
			public DeptDTO get(long deptno) {
				DeptDTO returnDto = new DeptDTO() ;
				returnDto.setDeptno(deptno);
				returnDto.setDname("【Hystritx-Fallback】没有部门信息");
				returnDto.setLoc("【Hystritx-Fallback】没有部门位置");
				return returnDto ;
			}

			@Override
			public List<DeptDTO> list() {
				return new ArrayList<DeptDTO>() ; 
			}};
	}

}
