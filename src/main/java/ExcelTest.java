/**
 * Copyright (C), 2011-2018, 微贷网.
 */

/**
 * @author binglin 2018/3/22.
 */
public class ExcelTest {

//    /**
//     * 读取账户信息
//     * @param file
//     * @return
//     * @throws Exception
//     */
//    public static List<AccountInfo> readExcelAccountInfo(File file)throws Exception {
//        String prefix = FileTypeUtil.getFileByFile(file);
//        if("xlsx".equals(prefix)){  //用XSSF，另外的用HSSF
//            return readXlsx(file);
//        }else{
//            throw new IOException("file type must be xlsx!");
//        }
//
//    }
//
//    /**
//     * 读取账户信息
//     * @param file
//     * @return
//     * @throws Exception
//     */
//    public static List<String> readExcelLoanId(File file)throws Exception {
//        String prefix = FileTypeUtil.getFileByFile(file);
//        if("xlsx".equals(prefix)){  //用XSSF，另外的用HSSF
//            return readXlsxLoanId(file);
//        }else{
//            throw new IOException("file type must be xlsx!");
//        }
//
//    }
//
//    /**
//     * xlsx格式读取
//     * @param file
//     * @return
//     * @throws IOException
//     */
//    public static List<AccountInfo> readXlsx(File file) throws IOException {
//        FileInputStream fis = new FileInputStream(file);
//        XSSFWorkbook wb=null;
//        List<AccountInfo> data=new ArrayList<>();
//        try {
//            wb = new XSSFWorkbook(fis);
//            XSSFSheet sheet = wb.getSheetAt(0);  //只取第一张工作表
//            if (null == sheet) {
//                wb.close();
//                return null;
//            }
//            sheet.removeRow(sheet.getRow(0));; //移除表头
//            int flag = 0;
//            for(Row row:sheet){
//                flag = 0;
//                AccountInfo info = new AccountInfo();
//                Double cid = Double.valueOf(cell(row.getCell(3)).toString());
//                info.setCid(cid.longValue());
//                info.setName(row.getCell(6) == null ? "" : cell(row.getCell(6)).toString());
//                info.setIdCard(row.getCell(7) == null ? "" : cell(row.getCell(7)).toString());
//                info.setMobile(row.getCell(8) == null ? "" : cell(row.getCell(8)).toString());
//                info.setBankCard(row.getCell(9) == null ? "" : cell(row.getCell(9)).toString());
//                info.setRemark(row.getCell(10) == null ? "" : cell(row.getCell(10)).toString());
//                for (AccountInfo accountInfo : data) {
//                    if (info.getIdCard().equals(accountInfo.getIdCard())) {
//                        flag = 1;
//                        break;
//                    }
//                }
//                if (flag == 1) {
//                    continue;
//                }
//                data.add(info);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            LOGGER.error(e.getMessage());
//        }
//        return data;
//    }
//
//
//    /**
//     * xlsx格式读取
//     * @param file
//     * @return
//     * @throws IOException
//     */
//    public static List<String> readXlsxLoanId(File file) throws IOException {
//        FileInputStream fis = new FileInputStream(file);
//        XSSFWorkbook wb=null;
//        List<String> loanIds = new ArrayList<>();
//        try {
//            wb = new XSSFWorkbook(fis);
//            XSSFSheet sheet = wb.getSheetAt(0);  //只取第一张工作表
//            if (null == sheet) {
//                wb.close();
//                return null;
//            }
//            int i =0;
//            for(Row row:sheet){
//                i = i + 1;
//                if (i==1) {
//                    continue;
//                }
//                loanIds.add(cell(row.getCell(0)).toString());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            LOGGER.error(e.getMessage());
//        }
//        return loanIds;
//    }
//
//    private static Object cell(Cell cell) {
//        Object o = null;
//        CellType cellType = cell.getCellTypeEnum();
//        switch (cellType) {
//            case STRING:
//                o = cell.getStringCellValue();
//                break;
//            case NUMERIC:  //防止变成科学计数法
//                DecimalFormat df = new DecimalFormat("0");
//                o = df.format(cell.getNumericCellValue());
//                break;
//            case BOOLEAN:
//                o = cell.getBooleanCellValue();
//                break;
//            case FORMULA:
//                o = cell.getArrayFormulaRange();
//                break;
//            case ERROR:
//                o = cell.getErrorCellValue();
//                break;
//            case BLANK:
//                o = "";
//                break;
//            default:
//                break;
//        }
//        return o == null ? "" : o;
//    }
}