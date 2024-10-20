package deob;

@ObfuscatedName("ek")
public class class140 extends class348 {

    @ObfuscatedName("ek.y")
    public static class222 field1566 = new class222(256);

    @ObfuscatedName("ek.j")
    public final int field1575;

    @ObfuscatedName("ek.o")
    public int field1559 = -1;

    @ObfuscatedName("ek.m")
    public int field1562 = -1;

    @ObfuscatedName("ek.r")
    public String field1563;

    @ObfuscatedName("ek.h")
    public int field1564;

    @ObfuscatedName("ek.d")
    public int field1565 = 0;

    @ObfuscatedName("ek.b")
    public boolean field1570 = true;

    @ObfuscatedName("ek.i")
    public boolean field1568 = false;

    @ObfuscatedName("ek.k")
    public String[] field1569 = new String[5];

    @ObfuscatedName("ek.g")
    public String field1561;

    @ObfuscatedName("ek.t")
    public int[] field1571;

    @ObfuscatedName("ek.x")
    public int field1574 = Integer.MAX_VALUE;

    @ObfuscatedName("ek.u")
    public int field1567 = Integer.MAX_VALUE;

    @ObfuscatedName("ek.q")
    public int field1572 = Integer.MIN_VALUE;

    @ObfuscatedName("ek.s")
    public int field1557 = Integer.MIN_VALUE;

    @ObfuscatedName("ek.p")
    public class146 field1576 = class146.field1634;

    @ObfuscatedName("ek.c")
    public class148 field1577 = class148.field1676;

    @ObfuscatedName("ek.n")
    public int[] field1578;

    @ObfuscatedName("ek.l")
    public byte[] field1579;

    @ObfuscatedName("ek.w")
    public int field1580 = -1;

    public class140(int arg0) {
        this.field1575 = arg0;
    }

    @ObfuscatedName("jf.f(II)Lek;")
    public static class140 method4496(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1560.length || Statics.field1560[arg0] == null ? new class140(arg0) : Statics.field1560[arg0];
    }

    @ObfuscatedName("ek.e(Lnt;S)V")
    public void method2422(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2420(arg0, var2);
        }
    }

    @ObfuscatedName("ek.v(Lnt;II)V")
    public void method2420(class384 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1559 = arg0.method5914();
        } else if (arg1 == 2) {
            this.field1562 = arg0.method5914();
        } else if (arg1 == 3) {
            this.field1563 = arg0.method5906();
        } else if (arg1 == 4) {
            this.field1564 = arg0.method5901();
        } else if (arg1 == 5) {
            arg0.method5901();
        } else if (arg1 == 6) {
            this.field1565 = arg0.method5902();
        } else if (arg1 == 7) {
            int var3 = arg0.method5902();
            if ((var3 & 0x1) == 0) {
                this.field1570 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1568 = true;
            }
        } else if (arg1 == 8) {
            arg0.method5902();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1569[arg1 - 10] = arg0.method5906();
        } else if (arg1 == 15) {
            int var4 = arg0.method5902();
            this.field1571 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1571[var5] = arg0.method6109();
            }
            arg0.method5965();
            int var6 = arg0.method5902();
            this.field1578 = new int[var6];
            for (int var7 = 0; var7 < this.field1578.length; var7++) {
                this.field1578[var7] = arg0.method5965();
            }
            this.field1579 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1579[var8] = arg0.method5968();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1561 = arg0.method5906();
            } else if (arg1 == 18) {
                arg0.method5914();
            } else if (arg1 == 19) {
                this.field1580 = arg0.method5899();
            } else if (arg1 == 21) {
                arg0.method5965();
            } else if (arg1 == 22) {
                arg0.method5965();
            } else if (arg1 == 23) {
                arg0.method5902();
                arg0.method5902();
                arg0.method5902();
            } else if (arg1 == 24) {
                arg0.method6109();
                arg0.method6109();
            } else if (arg1 == 25) {
                arg0.method5914();
            } else if (arg1 == 28) {
                arg0.method5902();
            } else if (arg1 == 29) {
                this.field1576 = (class146) class290.method2391(class146.method563(), arg0.method5902());
            } else if (arg1 == 30) {
                this.field1577 = (class148) class290.method2391(class148.method2102(), arg0.method5902());
            }
        }
    }

    @ObfuscatedName("ek.y(B)V")
    public void method2421() {
        if (this.field1571 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1571.length; var1 += 2) {
            if (this.field1571[var1] < this.field1574) {
                this.field1574 = this.field1571[var1];
            } else if (this.field1571[var1] > this.field1572) {
                this.field1572 = this.field1571[var1];
            }
            if (this.field1571[var1 + 1] < this.field1567) {
                this.field1567 = this.field1571[var1 + 1];
            } else if (this.field1571[var1 + 1] > this.field1557) {
                this.field1557 = this.field1571[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ek.j(ZB)Loa;")
    public class397 method2433(boolean arg0) {
        int var2 = arg0 ? this.field1562 : this.field1559;
        return this.method2423(var2);
    }

    @ObfuscatedName("ek.o(IB)Loa;")
    public class397 method2423(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class397 var2 = (class397) field1566.method3987((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class397 var3 = class398.method3491(Statics.field2931, arg0, 0);
        if (var3 != null) {
            field1566.method3988(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ek.m(B)I")
    public int method2437() {
        return this.field1575;
    }
}
