package deob;

@ObfuscatedName("en")
public class class154 extends class365 {

    @ObfuscatedName("en.a")
    public static class236 field1620 = new class236(256);

    @ObfuscatedName("en.o")
    public final int field1623;

    @ObfuscatedName("en.g")
    public int field1632 = -1;

    @ObfuscatedName("en.e")
    public int field1625 = -1;

    @ObfuscatedName("en.p")
    public String field1626;

    @ObfuscatedName("en.j")
    public int field1627;

    @ObfuscatedName("en.b")
    public int field1628 = 0;

    @ObfuscatedName("en.y")
    public boolean field1642 = true;

    @ObfuscatedName("en.k")
    public boolean field1630 = false;

    @ObfuscatedName("en.t")
    public String[] field1631 = new String[5];

    @ObfuscatedName("en.l")
    public String field1640;

    @ObfuscatedName("en.u")
    public int[] field1633;

    @ObfuscatedName("en.n")
    public int field1634 = Integer.MAX_VALUE;

    @ObfuscatedName("en.z")
    public int field1635 = Integer.MAX_VALUE;

    @ObfuscatedName("en.q")
    public int field1636 = Integer.MIN_VALUE;

    @ObfuscatedName("en.d")
    public int field1622 = Integer.MIN_VALUE;

    @ObfuscatedName("en.r")
    public class160 field1624 = class160.field1693;

    @ObfuscatedName("en.m")
    public class162 field1629 = class162.field1740;

    @ObfuscatedName("en.c")
    public int[] field1637;

    @ObfuscatedName("en.f")
    public byte[] field1639;

    @ObfuscatedName("en.h")
    public int field1641 = -1;

    public class154(int arg0) {
        this.field1623 = arg0;
    }

    @ObfuscatedName("ff.i(II)Len;")
    public static class154 method3068(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1619.length || Statics.field1619[arg0] == null ? new class154(arg0) : Statics.field1619[arg0];
    }

    @ObfuscatedName("en.w(Lop;S)V")
    public void method2695(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2697(arg0, var2);
        }
    }

    @ObfuscatedName("en.s(Lop;IB)V")
    public void method2697(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1632 = arg0.method6220();
        } else if (arg1 == 2) {
            this.field1625 = arg0.method6220();
        } else if (arg1 == 3) {
            this.field1626 = arg0.method6335();
        } else if (arg1 == 4) {
            this.field1627 = arg0.method6432();
        } else if (arg1 == 5) {
            arg0.method6432();
        } else if (arg1 == 6) {
            this.field1628 = arg0.method6240();
        } else if (arg1 == 7) {
            int var3 = arg0.method6240();
            if ((var3 & 0x1) == 0) {
                this.field1642 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1630 = true;
            }
        } else if (arg1 == 8) {
            arg0.method6240();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1631[arg1 - 10] = arg0.method6335();
        } else if (arg1 == 15) {
            int var4 = arg0.method6240();
            this.field1633 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1633[var5] = arg0.method6243();
            }
            arg0.method6245();
            int var6 = arg0.method6240();
            this.field1637 = new int[var6];
            for (int var7 = 0; var7 < this.field1637.length; var7++) {
                this.field1637[var7] = arg0.method6245();
            }
            this.field1639 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1639[var8] = arg0.method6241();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1640 = arg0.method6335();
            } else if (arg1 == 18) {
                arg0.method6220();
            } else if (arg1 == 19) {
                this.field1641 = arg0.method6242();
            } else if (arg1 == 21) {
                arg0.method6245();
            } else if (arg1 == 22) {
                arg0.method6245();
            } else if (arg1 == 23) {
                arg0.method6240();
                arg0.method6240();
                arg0.method6240();
            } else if (arg1 == 24) {
                arg0.method6243();
                arg0.method6243();
            } else if (arg1 == 25) {
                arg0.method6220();
            } else if (arg1 == 28) {
                arg0.method6240();
            } else if (arg1 == 29) {
                class160[] var9 = new class160[] { class160.field1700, class160.field1693, class160.field1695 };
                this.field1624 = (class160) class304.method2319(var9, arg0.method6240());
            } else if (arg1 == 30) {
                this.field1629 = (class162) class304.method2319(class162.method2659(), arg0.method6240());
            }
        }
    }

    @ObfuscatedName("en.a(B)V")
    public void method2698() {
        if (this.field1633 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1633.length; var1 += 2) {
            if (this.field1633[var1] < this.field1634) {
                this.field1634 = this.field1633[var1];
            } else if (this.field1633[var1] > this.field1636) {
                this.field1636 = this.field1633[var1];
            }
            if (this.field1633[var1 + 1] < this.field1635) {
                this.field1635 = this.field1633[var1 + 1];
            } else if (this.field1633[var1 + 1] > this.field1622) {
                this.field1622 = this.field1633[var1 + 1];
            }
        }
    }

    @ObfuscatedName("en.o(ZI)Low;")
    public class414 method2700(boolean arg0) {
        int var2 = arg0 ? this.field1625 : this.field1632;
        return this.method2710(var2);
    }

    @ObfuscatedName("en.g(II)Low;")
    public class414 method2710(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class414 var2 = (class414) field1620.method4205((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class414 var3 = class415.method3531(Statics.field1638, arg0, 0);
        if (var3 != null) {
            field1620.method4206(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("en.e(I)I")
    public int method2701() {
        return this.field1623;
    }
}
