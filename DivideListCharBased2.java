import java.util.ArrayList;
import java.util.List;

public class DivideListCharBased2 {
    public static void main(String[] args) {

        List<String> list = getList();
        List<String> supp = getSupplier();

        DivideListCharBased2 d = new DivideListCharBased2();

        List<List<String>> finalList = new ArrayList<>();
        d.divide(finalList, list, supp);

        System.out.println(list.size());
        System.out.println();

        finalList.stream().forEach(a -> System.out.println(a.size()));
    }

    private void divide(List<List<String>> finalList, List<String> list, List<String> supp) {
        int lpp = 24;  // lines per page
        double cpl = 53d;  // character per line
        double supp_s = 25d; // character per line supplier


        List<String> newList = new ArrayList<>();

        int size = list.size();

        for (int i = 0; i < size; i++) {
            int l = (int) Math.ceil((list.get(i).length()/cpl)); // 57 / 53
            int ls = (int) Math.ceil((supp.get(i).length()/supp_s));

            int lss = l > ls ? l : ls;

            if (i == size - 1) {
                finalList.add(newList);
            }




            if (lpp == 0) {
                finalList.add(newList);

                lpp = 24;  // lines per page
                newList = new ArrayList<>();
            }


            if (lss >= 3) {
                // 3 lines
                if (lpp > 3) {
                    lpp = lpp - 3;
                    String s = list.get(i);
                    newList.add(s);
                } else {
                    finalList.add(newList);

                    lpp = 24;  // lines per page
                    newList = new ArrayList<>();
                    newList.add(list.get(i));
                    // create new list
                }
            } else if (lss >= 2) {
                // 2 lines
                if (lpp > 2) {
                    lpp = lpp - 2;

                    String s = list.get(i);
                    newList.add(s);
                } else {
                    finalList.add(newList);

                    lpp = 24;  // lines per page
                    newList = new ArrayList<>();
                    newList.add(list.get(i));
                    // create new list
                }
            } else {
                // 1 line
                if (lpp > 0) {
                    lpp = lpp - 1;
                    String s = list.get(i);
                    newList.add(s);
                } else {
                    finalList.add(newList);

                    lpp = 24;  // lines per page
                    newList = new ArrayList<>();
                    newList.add(list.get(i));
                    // create new list
                }
            }
        }
    }


    private static List<String> getList() {
        String s0 = "ACA Professional - Audit and Assurance - Exam Preparation";

        String s1 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s2 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s3 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s4 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s5 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s6 = "ACA Professional - Audit and Assurance - Exam Preparation";
        String s7 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s8 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s9 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s10 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s11 = "ACA Professional - Audit and Assurance - Exam Preparation";
        String s12 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s13 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1 AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s14 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s15 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s16 = "ACA Professional - Audit and Assurance - Exam Preparation";
        String s17 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s18 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s19 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s20 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s21 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1 AAT Adv Dip - Management Accounting Costing - Evening Online 1";

        String s22 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s23 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s24 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s25 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s26 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s27 = "ACA Professional - Audit and Assurance - Exam Preparation";
        String s28 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s29 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s30 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s31 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s32 = "ACA Professional - Audit and Assurance - Exam Preparation";
        String s33 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s34 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1 AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s35 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s36 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s37 = "ACA Professional - Audit and Assurance - Exam Preparation";
        String s38 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s39 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s40 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s41 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s42 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1 AAT Adv Dip - Management Accounting Costing - Evening Online 1";

        String s43 = "ACCA AAA Advanced Audit and Assurance - QB Day Weekday";
        String s44 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s45 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s46 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s47 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1 AAT Adv Dip - Management Accounting Costing - Evening Online 1";
        String s48 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s49 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s50 = "AAT Adv Dip - Management Accounting Costing - Evening Online 1 AAT Adv Dip - Management Accounting Costing - Evening Online 1";


        List<String> list = new ArrayList<>();
        list.add(s0);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);
        list.add(s11);
        list.add(s12);
        list.add(s13);
        list.add(s14);
        list.add(s15);
        list.add(s16);
        list.add(s17);
        list.add(s18);
        list.add(s19);
        list.add(s20);
        list.add(s21);

        list.add(s21);
        list.add(s22);
        list.add(s23);
        list.add(s24);
        list.add(s25);
        list.add(s26);
        list.add(s27);
        list.add(s28);
        list.add(s29);
        list.add(s30);
        list.add(s31);
        list.add(s32);
        list.add(s33);
        list.add(s34);
        list.add(s35);
        list.add(s36);
        list.add(s37);
        list.add(s38);
        list.add(s39);
        list.add(s40);
        list.add(s41);
        list.add(s42);
        list.add(s43);

        list.add(s44);
        list.add(s45);
        list.add(s46);
        list.add(s47);
        list.add(s48);
        list.add(s49);
        list.add(s50);




        return list;
    }



    private static List<String> getSupplier() {
        String s0 = "ACA Professional";

        String s1 = "ACCA AAA Advanced Audit";
        String s2 = "ACCA AAA Advanced Audit";
        String s3 = "AAT Adv Dip - Management";
        String s4 = "AAT Adv Dip - Management";
        String s5 = "AAT Foundation - Bookkeeping and";
        String s6 = "ACA Professional - Audit and Assurance";
        String s7 = "ACCA AAA Advanced Audit and Assurance";
        String s8 = "AAT Adv Dip - Management Evening Online 1";
        String s9 = "AAT Adv Dip - Management Evening";
        String s10 = "AAT Foundation - Bookkeeay";
        String s11 = "ACA Professional - Audit Preparation";
        String s12 = "ACCA AAA Advanced Audit y Weekday";
        String s13 = "AAT Adv Dip - Management Evening";
        String s14 = "AAT Adv Dip - Management Evening";
        String s15 = "AAT Foundation - Bookkeeay";
        String s16 = "ACA Professional - Audit Preparation";
        String s17 = "ACCA AAA Advanced Audit y Weekday";
        String s18 = "AAT Adv Dip - Management Evening";
        String s19 = "AAT Adv Dip - Management Evening";
        String s20 = "AAT Foundation - Bookkeeay";
        String s21 = "AAT Adv Dip - Management Evening";

        String s22 = "ACCA AAAB Day Weekday";
        String s23 = "ACCA AAAB Day Weekday";
        String s24 = "AAT Adv ng - Evening Online 1";
        String s25 = "AAT Adv ng - Evening";
        String s26 = "AAT Founeekday";
        String s27 = "ACA ProfExam Preparation";
        String s28 = "ACCA AAAB Day Weekday";
        String s29 = "AAT Adv ng - Evening Online 1";
        String s30 = "AAT Adv ng - Evening";
        String s31 = "AAT Founeekday";
        String s32 = "ACA ProfExam Preparation";
        String s33 = "ACCA AAAB Day Weekday";
        String s34 = "AAT Adv ng - Evening Online 1";
        String s35 = "AAT Adv ng - Evening";
        String s36 = "AAT Founeekday";
        String s37 = "ACA ProfExam Preparation";
        String s38 = "ACCA AAAB Day Weekday";
        String s39 = "AAT Adv ng - Evening Online 1";
        String s40 = "AAT Adv ng - Evening";
        String s41 = "AAT Founeekday";
        String s42 = "AAT Adv ng - Evening Online 1";

        String s43 = "ACCA AAA Advanced Audit Assurance - QB Day ";
        String s44 = "AAT Adv Dip - Management Costing - Evening 1";
        String s45 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s46 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s47 = "AAT Adv Dip - Management Accounting Costing ";
        String s48 = "AAT Adv Dip - Management Accounting Costing - Evening";
        String s49 = "AAT Foundation - Bookkeeping Controls - Weekday";
        String s50 = "AAT Adv Dip - Management Accounting 1";


        List<String> supp = new ArrayList<>();
        supp.add(s0);
        supp.add(s1);
        supp.add(s2);
        supp.add(s3);
        supp.add(s4);
        supp.add(s5);
        supp.add(s6);
        supp.add(s7);
        supp.add(s8);
        supp.add(s9);
        supp.add(s10);
        supp.add(s11);
        supp.add(s12);
        supp.add(s13);
        supp.add(s14);
        supp.add(s15);
        supp.add(s16);
        supp.add(s17);
        supp.add(s18);
        supp.add(s19);
        supp.add(s20);
        supp.add(s21);

        supp.add(s21);
        supp.add(s22);
        supp.add(s23);
        supp.add(s24);
        supp.add(s25);
        supp.add(s26);
        supp.add(s27);
        supp.add(s28);
        supp.add(s29);
        supp.add(s30);
        supp.add(s31);
        supp.add(s32);
        supp.add(s33);
        supp.add(s34);
        supp.add(s35);
        supp.add(s36);
        supp.add(s37);
        supp.add(s38);
        supp.add(s39);
        supp.add(s40);
        supp.add(s41);
        supp.add(s42);
        supp.add(s43);

        supp.add(s44);
        supp.add(s45);
        supp.add(s46);
        supp.add(s47);
        supp.add(s48);
        supp.add(s49);
        supp.add(s50);




        return supp;
    }
}
