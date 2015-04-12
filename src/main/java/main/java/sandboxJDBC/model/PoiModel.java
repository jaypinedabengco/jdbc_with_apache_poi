package main.java.sandboxJDBC.model;

import org.apache.poi.ss.usermodel.Cell;

public abstract class PoiModel {
	
	@SuppressWarnings("unchecked")
	public <T extends Object> T getValue(Cell cell){
		
		T value = null;
		
        switch (cell.getCellType()) {
	        case Cell.CELL_TYPE_STRING:
	            value  = (T) cell.getStringCellValue();
	            break;
	        case Cell.CELL_TYPE_NUMERIC:
	            value = (T) new Double(cell.getNumericCellValue());
	            break;
	        case Cell.CELL_TYPE_BOOLEAN:
	            value = (T) new Boolean(cell.getBooleanCellValue());
	            break;
	        default :
        }
        
        return value;
		
	}

}
