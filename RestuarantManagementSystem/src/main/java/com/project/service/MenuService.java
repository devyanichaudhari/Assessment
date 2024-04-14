package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.Menu;
@Service
public interface MenuService {
	Menu createMenu(Menu m);
	Menu updateMenu(Menu m) ;
	List<Menu> getAllMenu();
	Menu getMenuById(int id);
	void deleteMenu(int id);
	
	/*@Autowired
	private MenuRepository repo;
		
		public Menu createMenu(Menu m) 
		{
			return repo.save(m);
		}

		public Menu updateMenu(Menu m) throws RestuarantResource 
		{
			Optional<Menu> menu = repo.findById(m.getMenuId());
			if(menu.isPresent())
			{
				Menu updateMenu = menu.get();
				updateMenu.setMenuId(m.getMenuId());;
				updateMenu.setMenuName(m.getMenuName());
				updateMenu.setPrice(m.getPrice());
				repo.save(updateMenu);
				return updateMenu;
			}
			else
			{
				throw new RestuarantResource("Searching id is not available");
			}
		}

		public List<Menu> getAllMenu() 
		{
			return repo.findAll();
		}
		
		public Menu getMenuById(int id) throws RestuarantResource 
		{
			Optional<Menu> menu = repo.findById(id);
			if(menu.isPresent())
			{
				return menu.get();		
			}
			else
			{
				throw new RestuarantResource("Searching id is not available");
			}
		}

		public void deleteMenu(int id) throws RestuarantResource 
		{
			Optional<Menu> menu1 = repo.findById(id);
			if(menu1.isPresent())
			{
				repo.delete(menu1.get());		
			}
			else
			{
				throw new RestuarantResource("Searching id is not available");
			}	
		}*/
}
