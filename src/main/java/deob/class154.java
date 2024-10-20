package deob;

@ObfuscatedName("eo")
public class class154 extends class365 {

    @ObfuscatedName("eo.j")
    public static class236 field1629 = new class236(256);

    @ObfuscatedName("eo.m")
    public final int field1627;

    @ObfuscatedName("eo.k")
    public int field1647 = -1;

    @ObfuscatedName("eo.t")
    public int field1648 = -1;

    @ObfuscatedName("eo.a")
    public String field1630;

    @ObfuscatedName("eo.e")
    public int field1631;

    @ObfuscatedName("eo.i")
    public int field1632 = 0;

    @ObfuscatedName("eo.w")
    public boolean field1634 = true;

    @ObfuscatedName("eo.g")
    public boolean field1635 = false;

    @ObfuscatedName("eo.v")
    public String[] field1636 = new String[5];

    @ObfuscatedName("eo.s")
    public String field1628;

    @ObfuscatedName("eo.c")
    public int[] field1637;

    @ObfuscatedName("eo.b")
    public int field1639 = Integer.MAX_VALUE;

    @ObfuscatedName("eo.x")
    public int field1644 = Integer.MAX_VALUE;

    @ObfuscatedName("eo.p")
    public int field1641 = Integer.MIN_VALUE;

    @ObfuscatedName("eo.z")
    public int field1642 = Integer.MIN_VALUE;

    @ObfuscatedName("eo.h")
    public class160 field1643 = class160.field1707;

    @ObfuscatedName("eo.o")
    public class162 field1626 = class162.field1753;

    @ObfuscatedName("eo.r")
    public int[] field1645;

    @ObfuscatedName("eo.n")
    public byte[] field1646;

    @ObfuscatedName("eo.u")
    public int field1638 = -1;

    public class154(int arg0) {
        this.field1627 = arg0;
    }

    @ObfuscatedName("v.l(IB)Leo;")
    public static class154 method156(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1624.length || Statics.field1624[arg0] == null ? new class154(arg0) : Statics.field1624[arg0];
    }

    @ObfuscatedName("eo.q(Lot;I)V")
    public void method2651(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2672(arg0, var2);
        }
    }

    @ObfuscatedName("eo.f(Lot;II)V")
    public void method2672(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1647 = arg0.method6353();
        } else if (arg1 == 2) {
            this.field1648 = arg0.method6353();
        } else if (arg1 == 3) {
            this.field1630 = arg0.method6474();
        } else if (arg1 == 4) {
            this.field1631 = arg0.method6276();
        } else if (arg1 == 5) {
            arg0.method6276();
        } else if (arg1 == 6) {
            this.field1632 = arg0.method6272();
        } else if (arg1 == 7) {
            int var3 = arg0.method6272();
            if ((var3 & 0x1) == 0) {
                this.field1634 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1635 = true;
            }
        } else if (arg1 == 8) {
            arg0.method6272();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1636[arg1 - 10] = arg0.method6474();
        } else if (arg1 == 15) {
            int var4 = arg0.method6272();
            this.field1637 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1637[var5] = arg0.method6308();
            }
            arg0.method6277();
            int var6 = arg0.method6272();
            this.field1645 = new int[var6];
            for (int var7 = 0; var7 < this.field1645.length; var7++) {
                this.field1645[var7] = arg0.method6277();
            }
            this.field1646 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1646[var8] = arg0.method6273();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1628 = arg0.method6474();
            } else if (arg1 == 18) {
                arg0.method6353();
            } else if (arg1 == 19) {
                this.field1638 = arg0.method6284();
            } else if (arg1 == 21) {
                arg0.method6277();
            } else if (arg1 == 22) {
                arg0.method6277();
            } else if (arg1 == 23) {
                arg0.method6272();
                arg0.method6272();
                arg0.method6272();
            } else if (arg1 == 24) {
                arg0.method6308();
                arg0.method6308();
            } else if (arg1 == 25) {
                arg0.method6353();
            } else if (arg1 == 28) {
                arg0.method6272();
            } else if (arg1 == 29) {
                this.field1643 = (class160) class304.method2484(class160.method694(), arg0.method6272());
            } else if (arg1 == 30) {
                class162[] var9 = new class162[] { class162.field1748, class162.field1753, class162.field1749 };
                this.field1626 = (class162) class304.method2484(var9, arg0.method6272());
            }
        }
    }

    @ObfuscatedName("eo.j(I)V")
    public void method2653() {
        if (this.field1637 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1637.length; var1 += 2) {
            if (this.field1637[var1] < this.field1639) {
                this.field1639 = this.field1637[var1];
            } else if (this.field1637[var1] > this.field1641) {
                this.field1641 = this.field1637[var1];
            }
            if (this.field1637[var1 + 1] < this.field1644) {
                this.field1644 = this.field1637[var1 + 1];
            } else if (this.field1637[var1 + 1] > this.field1642) {
                this.field1642 = this.field1637[var1 + 1];
            }
        }
    }

    @ObfuscatedName("eo.m(ZI)Lon;")
    public class414 method2654(boolean arg0) {
        int var2 = arg0 ? this.field1648 : this.field1647;
        return this.method2655(var2);
    }

    @ObfuscatedName("eo.k(IB)Lon;")
    public class414 method2655(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class414 var2 = (class414) field1629.method4223((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class414 var3 = class415.method6113(Statics.field1640, arg0, 0);
        if (var3 != null) {
            field1629.method4225(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("eo.t(I)I")
    public int method2656() {
        return this.field1627;
    }

    @ObfuscatedName("eh.a(I)V")
    public static void method2619() {
        field1629.method4226();
    }
}
