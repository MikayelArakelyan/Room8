package HomeWorks;

public class HomeWork {
    public static void main(String[] args) {
//        int tiv = 234;
//        boolean t;
//        System.out.println("------------------------");
//
//        int num1 = tiv / 100;
//        int num2 = (tiv / 10) % 10;
//        int num3 = tiv % 10;
//        System.out.println("tiv = " + tiv);
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//        System.out.println("num3 = " + num3);
//        System.out.println("-----------51-----------");
//        if (num1 + num2 == num3) {
//            System.out.println(t = true);
//        } else {
//            System.out.println(t = false);
//        }
//        System.out.println("-----------52-----------");
//        if (num1 == num2 || num1 == num3 || num2 == num3) {
//            System.out.println(t = true);
//        } else {
//            System.out.println(t = false);
//        }
//        System.out.println("-----------23-----------");
//        System.out.println((num1 == 1 || num2 == 1 || num3 == 1 ? true : false));
//        System.out.println("-----------24-----------");
//        System.out.println(((num1 == 2 && num2 == 2) || (num1 == 2 && num3 == 2) || (num2 == 2 && num3 == 2) ? true : false));
//        System.out.println("-----------25-----------");
//        int a = num1, b = num2, c = num3;
//        if (a + b > c && a + c > b && b + c > a) {
//            System.out.println("y=1");
//        } else {
//            System.out.println("y=2");
//        }
//        System.out.println("-----------26-----------");
//        if ((a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0)) {
//            System.out.println('1');
//        } else {
//            System.out.println('2');
//        }
//        System.out.println("-----------27-----------");
//        if (a - b == b - c || c - b == b - a) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//        System.out.println("-----------28-----------");
//        double a1 = a * 1.0;
//        double b1 = b * 1.0;
//        double c1 = c * 1.0;
//        System.out.println(a1 / b1 == b1 / c1 || c1 / b1 == b1 / a1 ? true : false);
//        System.out.println("-----------29-----------");
//        if (a > b && a > c) {
//            if (b > c) {
//                System.out.println(a + " " + b + " " + c);
//            } else {
//                System.out.println(a + " " + c + " " + b);
//            }
//        } else if (b > a && b > c) {
//            if (a > c) {
//                System.out.println(b + " " + a + " " + c);
//            } else {
//                System.out.println(b + " " + c + " " + a);
//            }
//        } else if (a > b) {
//            System.out.println(c + " " + a + " " + b);
//        } else {
//            System.out.println(c + " " + b + " " + a);
//        }
//        System.out.println("-----------30-----------");
//        if (a > b && a > c) {
//            if (b > c) {
//                System.out.println(c + " " + b + " " + a);
//            } else {
//                System.out.println(b + " " + c + " " + a);
//            }
//        } else if (b > a && b > c) {
//            if (a > c) {
//                System.out.println(c + " " + a + " " + b);
//            } else {
//                System.out.println(a + " " + c + " " + b);
//            }
//        } else if (a > b) {
//            System.out.println(b + " " + a + " " + c);
//        } else {
//            System.out.println(a + " " + b + " " + c);
//        }
//        System.out.println("-----------31-----------");
//        int newTiv = 5678;
//        int newNum1 = newTiv / 1000;
//        int newNum2 = (newTiv / 100) % 10;
//        int newNum3 = (newTiv / 10) % 10;
//        int newNum4 = newTiv % 10;
//        System.out.println("newTiv = " + newTiv);
//        System.out.println("newNum1 = " + newNum1);
//        System.out.println("newNum2 = " + newNum2);
//        System.out.println("newNum3 = " + newNum3);
//        System.out.println("newNum4 = " + newNum4);
//        int aa = newNum1;
//        int bb = newNum2;
//        int cc = newNum3;
//        int dd = newNum4;
//        System.out.print("Max number : ");
//        if (aa > bb && aa > cc && aa > dd) {
//            System.out.println(aa);
//        } else if (bb > aa & bb > cc & bb > dd) {
//            System.out.println(bb);
//        } else if (cc > aa & cc > bb & cc > dd) {
//            System.out.println(cc);
//        } else {
//            System.out.println(dd);
//        }
//        System.out.println("-----------32-----------");
//        System.out.print("Min number : ");
//        if (aa < bb && aa < cc && aa < dd) {
//            System.out.println(aa);
//        } else if (bb < aa & bb < cc & bb < dd) {
//            System.out.println(bb);
//        } else if (cc < aa & cc < bb & cc < dd) {
//            System.out.println(cc);
//        } else {
//            System.out.println(dd);
//        }
//        System.out.println("-----------33-----------");
//        if (aa == bb || aa == cc || aa == dd || bb == cc || bb == dd || cc == dd) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//        System.out.println("-----------34-----------");
//        if (aa + bb == cc + dd || aa + cc == bb + dd || aa + dd == bb + cc) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//        System.out.println("-----------35-----------");
//        System.out.println((aa == bb + cc + dd || bb == aa + cc + dd || cc == aa + bb + dd || dd == aa + bb + cc ? true : false));
//        System.out.println("-----------36-----------");
//        if (aa % 2 != 0 && bb % 2 != 0 || aa % 2 != 0 && cc % 2 != 0 || aa % 2 != 0 && dd % 2 != 0 || bb % 2 != 0 && cc % 2 != 0 || bb % 2 != 0 && dd % 2 != 0 || cc % 2 != 0 && dd % 2 != 0) {
//            System.out.println('1');
//        } else {
//            System.out.println("2");
//        }
//        System.out.println("-----------37-----------");
//        if (aa - bb == bb - cc && bb - cc == cc - dd || dd - cc == cc - bb & cc - bb == bb - aa) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//        System.out.println("-----------38-----------");
//        double aaa = aa * 1.0;
//        double bbb = bb * 1.0;
//        double ccc = cc * 1.0;
//        double ddd = dd * 1.0;
//        if (aaa / bbb == bbb / ccc & bbb / ccc == ccc / ddd || ddd / ccc == ccc / bbb & ccc / bbb == bbb / aaa) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//        System.out.println("-----------39-----------");
//
//        if (aa > bb && aa > cc & aa > dd) {
//            if (bb > cc && bb > dd) {
//                if (cc > dd) {
//                    System.out.println(dd + " " + cc + " " + bb + " " + aa);
//                } else {
//                    System.out.println(cc + " " + dd + " " + bb + " " + aa);
//                }
//            } else if (cc > bb & cc > dd) {
//                if (bb > dd) {
//                    System.out.println(dd + " " + bb + " " + cc + " " + aa);
//                } else {
//                    System.out.println(bb + " " + dd + " " + cc + " " + aa);
//                }
//            } else {
//                if (dd > bb && dd > cc) {
//                    if (bb > cc) {
//                        System.out.println(cc + " " + bb + " " + dd + " " + aa);
//                    } else {
//                        System.out.println(bb + " " + cc + " " + dd + " " + aa);
//                    }
//                }
//            }
//        } else if (bb > aa && bb > cc & bb > dd) {
//            if (aa > cc && aa > dd) {
//                if (cc > dd) {
//                    System.out.println(dd + " " + cc + " " + aa + " " + bb);
//                } else {
//                    System.out.println(cc + " " + dd + " " + aa + " " + bb);
//                }
//            } else if (cc > aa & cc > dd) {
//                if (aa > dd) {
//                    System.out.println(dd + " " + aa + " " + cc + " " + bb);
//                } else {
//                    System.out.println(aa + " " + dd + " " + cc + " " + bb);
//                }
//            } else {
//                if (dd > aa && dd > cc) {
//                    if (aa > cc) {
//                        System.out.println(cc + " " + aa + " " + dd + " " + bb);
//                    } else {
//                        System.out.println(aa + " " + cc + " " + dd + " " + bb);
//                    }
//                }
//            }
//        } else if (cc > aa && cc > bb & cc > dd) {
//            if (aa > bb && aa > dd) {
//                if (bb > dd) {
//                    System.out.println(dd + " " + bb + " " + aa + " " + cc);
//                } else {
//                    System.out.println(bb + " " + dd + " " + aa + " " + cc);
//                }
//            } else if (bb > aa & bb > dd) {
//                if (aa > dd) {
//                    System.out.println(dd + " " + aa + " " + bb + " " + cc);
//                } else {
//                    System.out.println(aa + " " + dd + " " + bb + " " + cc);
//                }
//            } else {
//                if (dd > aa && dd > bb) {
//                    if (aa > bb) {
//                        System.out.println(bb + " " + aa + " " + dd + " " + cc);
//                    } else {
//                        System.out.println(aa + " " + bb + " " + dd + " " + cc);
//                    }
//                }
//            }
//        } else if (dd > aa && dd > bb & dd > cc) {
//            if (aa > bb && aa > cc) {
//                if (bb > cc) {
//                    System.out.println(cc + " " + bb + " " + aa + " " + dd);
//                } else {
//                    System.out.println(bb + " " + cc + " " + aa + " " + dd);
//                }
//            } else if (bb > aa & bb > cc) {
//                if (aa > cc) {
//                    System.out.println(cc + " " + aa + " " + bb + " " + dd);
//                } else {
//                    System.out.println(aa + " " + cc + " " + bb + " " + dd);
//                }
//            } else {
//                if (cc > aa && cc > bb) {
//                    if (aa > bb) {
//                        System.out.println(bb + " " + aa + " " + cc + " " + dd);
//                    } else {
//                        System.out.println(aa + " " + bb + " " + cc + " " + dd);
//                    }
//                }
//            }
//        }
//
//        System.out.println("-----------40-----------");
//
//        if (aa > bb && aa > cc & aa > dd) {
//            if (bb > cc && bb > dd) {
//                if (cc > dd) {
//                    System.out.println(aa + " " + bb + " " + cc + " " + dd);
//                } else {
//                    System.out.println(aa + " " + bb + " " + dd + " " + cc);
//                }
//            } else if (cc > bb & cc > dd) {
//                if (bb > dd) {
//                    System.out.println(aa + " " + cc + " " + bb + " " + dd);
//                } else {
//                    System.out.println(aa + " " + cc + " " + dd + " " + bb);
//                }
//            } else {
//                if (dd > bb && dd > cc) {
//                    if (bb > cc) {
//                        System.out.println(aa + " " + dd + " " + bb + " " + cc);
//                    } else {
//                        System.out.println(aa + " " + dd + " " + cc + " " + bb);
//                    }
//                }
//            }
//        } else if (bb > aa && bb > cc & bb > dd) {
//            if (aa > cc && aa > dd) {
//                if (cc > dd) {
//                    System.out.println(bb + " " + aa + " " + cc + " " + dd);
//                } else {
//                    System.out.println(bb + " " + aa + " " + dd + " " + cc);
//                }
//            } else if (cc > aa & cc > dd) {
//                if (aa > dd) {
//                    System.out.println(bb + " " + cc + " " + aa + " " + dd);
//                } else {
//                    System.out.println(bb + " " + cc + " " + dd + " " + aa);
//                }
//            } else {
//                if (dd > aa && dd > cc) {
//                    if (aa > cc) {
//                        System.out.println(bb + " " + dd + " " + aa + " " + cc);
//                    } else {
//                        System.out.println(bb + " " + dd + " " + cc + " " + aa);
//                    }
//                }
//            }
//        } else if (cc > aa && cc > bb & cc > dd) {
//            if (aa > bb && aa > dd) {
//                if (bb > dd) {
//                    System.out.println(cc + " " + aa + " " + bb + " " + dd);
//                } else {
//                    System.out.println(cc + " " + aa + " " + dd + " " + bb);
//                }
//            } else if (bb > aa & bb > dd) {
//                if (aa > dd) {
//                    System.out.println(cc + " " + bb + " " + aa + " " + dd);
//                } else {
//                    System.out.println(cc + " " + bb + " " + dd + " " + aa);
//                }
//            } else {
//                if (dd > aa && dd > bb) {
//                    if (aa > bb) {
//                        System.out.println(cc + " " + dd + " " + aa + " " + bb);
//                    } else {
//                        System.out.println(cc + " " + dd + " " + bb + " " + aa);
//                    }
//                }
//            }
//        } else if (dd > aa && dd > bb & dd > cc) {
//            if (aa > bb && aa > cc) {
//                if (bb > cc) {
//                    System.out.println(dd + " " + aa + " " + bb + " " + cc);
//                } else {
//                    System.out.println(dd + " " + aa + " " + cc + " " + bb);
//                }
//            } else if (bb > aa & bb > cc) {
//                if (aa > cc) {
//                    System.out.println(dd + " " + bb + " " + aa + " " + cc);
//                } else {
//                    System.out.println(dd + " " + bb + " " + cc + " " + aa);
//                }
//            } else {
//                if (cc > aa && cc > bb) {
//                    if (aa > bb) {
//                        System.out.println(dd + " " + cc + " " + aa + " " + bb);
//                    } else {
//                        System.out.println(dd + " " + cc + " " + bb + " " + aa);
//                    }
//                }
//            }
//        }
//
        int x = 1;

        switch (x) {
            case 1, 3, 5:
                System.out.println("Day off");
                break;
            case 2, 4, 6:
                System.out.println("Training day");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("No such week day");

        }

    }

}
//
