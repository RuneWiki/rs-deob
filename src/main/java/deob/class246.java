package deob;

@ObfuscatedName("jm")
public class class246 extends class502 {

    @ObfuscatedName("jm.au")
    public static class315 field2567 = new class315(64);

    @ObfuscatedName("jm.ax")
    public static class315 field2568 = new class315(50);

    @ObfuscatedName("jm.ao")
    public int field2569;

    @ObfuscatedName("jm.am")
    public String field2570 = class380.field4097;

    @ObfuscatedName("jm.ac")
    public int field2571 = 1;

    @ObfuscatedName("jm.ae")
    public int[] field2572;

    @ObfuscatedName("jm.ad")
    public int[] field2573;

    @ObfuscatedName("jm.aq")
    public int field2602 = -1;

    @ObfuscatedName("jm.al")
    public int field2589 = -1;

    @ObfuscatedName("jm.aj")
    public int field2606 = -1;

    @ObfuscatedName("jm.as")
    public int field2611 = -1;

    @ObfuscatedName("jm.aw")
    public int field2578 = -1;

    @ObfuscatedName("jm.af")
    public int field2579 = -1;

    @ObfuscatedName("jm.aa")
    public int field2566 = -1;

    @ObfuscatedName("jm.ah")
    public int field2581 = -1;

    @ObfuscatedName("jm.ag")
    public int field2580 = -1;

    @ObfuscatedName("jm.av")
    public int field2583 = -1;

    @ObfuscatedName("jm.ar")
    public int field2597 = -1;

    @ObfuscatedName("jm.ap")
    public int field2585 = -1;

    @ObfuscatedName("jm.ak")
    public int field2586 = -1;

    @ObfuscatedName("jm.ai")
    public int field2587 = -1;

    @ObfuscatedName("jm.at")
    public int field2588 = -1;

    @ObfuscatedName("jm.az")
    public short[] field2610;

    @ObfuscatedName("jm.bg")
    public short[] field2590;

    @ObfuscatedName("jm.bz")
    public short[] field2591;

    @ObfuscatedName("jm.bj")
    public short[] field2592;

    @ObfuscatedName("jm.bc")
    public String[] field2593 = new String[5];

    @ObfuscatedName("jm.bo")
    public boolean field2594 = true;

    @ObfuscatedName("jm.bm")
    public int field2595 = -1;

    @ObfuscatedName("jm.bd")
    public int field2564 = 128;

    @ObfuscatedName("jm.bh")
    public int field2601 = 128;

    @ObfuscatedName("jm.bx")
    public boolean field2598 = false;

    @ObfuscatedName("jm.bv")
    public int field2599 = 0;

    @ObfuscatedName("jm.bu")
    public int field2600 = 0;

    @ObfuscatedName("jm.bp")
    public int field2574 = 32;

    @ObfuscatedName("jm.br")
    public int[] field2582;

    @ObfuscatedName("jm.bf")
    public int field2577 = -1;

    @ObfuscatedName("jm.bq")
    public int field2596 = -1;

    @ObfuscatedName("jm.bt")
    public boolean field2605 = true;

    @ObfuscatedName("jm.bi")
    public boolean field2575 = true;

    @ObfuscatedName("jm.be")
    public boolean field2607 = false;

    @ObfuscatedName("jm.ba")
    public boolean field2608 = false;

    @ObfuscatedName("jm.bn")
    public int[] field2609 = null;

    @ObfuscatedName("jm.bw")
    public short[] field2604 = null;

    @ObfuscatedName("jm.bk")
    public int field2584 = -1;

    @ObfuscatedName("jm.bs")
    public class521 field2612;

    @ObfuscatedName("jm.bb")
    public int[] field2613 = new int[] { 1, 1, 1, 1, 1, 1 };

    @ObfuscatedName("ej.ab(II)Ljm;")
    public static class246 method2916(int arg0) {
        class246 var1 = (class246) field2567.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2565.method6670(9, arg0);
        class246 var3 = new class246();
        var3.field2569 = arg0;
        if (var2 != null) {
            var3.method4549(new class549(var2));
        }
        var3.method4566();
        field2567.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.ay(B)V")
    public void method4566() {
    }

    @ObfuscatedName("jm.an(Lvg;I)V")
    public void method4549(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4518(arg0, var2);
        }
    }

    @ObfuscatedName("jm.au(Lvg;II)V")
    public void method4518(class549 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method9025();
            this.field2572 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2572[var4] = arg0.method8968();
            }
        } else if (arg1 == 2) {
            this.field2570 = arg0.method8808();
        } else if (arg1 == 12) {
            this.field2571 = arg0.method9025();
        } else if (arg1 == 13) {
            this.field2602 = arg0.method8968();
        } else if (arg1 == 14) {
            this.field2611 = arg0.method8968();
        } else if (arg1 == 15) {
            this.field2589 = arg0.method8968();
        } else if (arg1 == 16) {
            this.field2606 = arg0.method8968();
        } else if (arg1 == 17) {
            this.field2611 = arg0.method8968();
            this.field2578 = arg0.method8968();
            this.field2579 = arg0.method8968();
            this.field2566 = arg0.method8968();
        } else if (arg1 == 18) {
            arg0.method8968();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2593[arg1 - 30] = arg0.method8808();
            if (this.field2593[arg1 - 30].equalsIgnoreCase(class380.field4137)) {
                this.field2593[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method9025();
            this.field2610 = new short[var5];
            this.field2590 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2610[var6] = (short) arg0.method8968();
                this.field2590[var6] = (short) arg0.method8968();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method9025();
            this.field2591 = new short[var7];
            this.field2592 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2591[var8] = (short) arg0.method8968();
                this.field2592[var8] = (short) arg0.method8968();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method9025();
            this.field2573 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2573[var10] = arg0.method8968();
            }
        } else if (arg1 == 74) {
            this.field2613[0] = arg0.method8968();
        } else if (arg1 == 75) {
            this.field2613[1] = arg0.method8968();
        } else if (arg1 == 76) {
            this.field2613[2] = arg0.method8968();
        } else if (arg1 == 77) {
            this.field2613[3] = arg0.method8968();
        } else if (arg1 == 78) {
            this.field2613[4] = arg0.method8968();
        } else if (arg1 == 79) {
            this.field2613[5] = arg0.method8968();
        } else if (arg1 == 93) {
            this.field2594 = false;
        } else if (arg1 == 95) {
            this.field2595 = arg0.method8968();
        } else if (arg1 == 97) {
            this.field2564 = arg0.method8968();
        } else if (arg1 == 98) {
            this.field2601 = arg0.method8968();
        } else if (arg1 == 99) {
            this.field2598 = true;
        } else if (arg1 == 100) {
            this.field2599 = arg0.method8798();
        } else if (arg1 == 101) {
            this.field2600 = arg0.method8798() * 5;
        } else if (arg1 == 102) {
            int var11 = arg0.method9025();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2609 = new int[var12];
            this.field2604 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2609[var14] = -1;
                    this.field2604[var14] = -1;
                } else {
                    this.field2609[var14] = arg0.method8863();
                    this.field2604[var14] = (short) arg0.method8840();
                }
            }
        } else if (arg1 == 103) {
            this.field2574 = arg0.method8968();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2577 = arg0.method8968();
            if (this.field2577 == 65535) {
                this.field2577 = -1;
            }
            this.field2596 = arg0.method8968();
            if (this.field2596 == 65535) {
                this.field2596 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8968();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method9025();
            this.field2582 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2582[var17] = arg0.method8968();
                if (this.field2582[var17] == 65535) {
                    this.field2582[var17] = -1;
                }
            }
            this.field2582[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2605 = false;
        } else if (arg1 == 109) {
            this.field2575 = false;
        } else if (arg1 == 114) {
            this.field2581 = arg0.method8968();
        } else if (arg1 == 115) {
            this.field2581 = arg0.method8968();
            this.field2580 = arg0.method8968();
            this.field2583 = arg0.method8968();
            this.field2597 = arg0.method8968();
        } else if (arg1 == 116) {
            this.field2585 = arg0.method8968();
        } else if (arg1 == 117) {
            this.field2585 = arg0.method8968();
            this.field2586 = arg0.method8968();
            this.field2587 = arg0.method8968();
            this.field2588 = arg0.method8968();
        } else if (arg1 == 122) {
            this.field2607 = true;
        } else if (arg1 == 123) {
            this.field2608 = true;
        } else if (arg1 == 124) {
            this.field2584 = arg0.method8968();
        } else if (arg1 == 249) {
            this.field2612 = class239.method3156(arg0, this.field2612);
        }
    }

    @ObfuscatedName("jm.ax(Lkr;ILkr;ILjl;I)Lhr;")
    public final class197 method4543(class264 arg0, int arg1, class264 arg2, int arg3, class245 arg4) {
        if (this.field2582 != null) {
            class246 var6 = this.method4522();
            return var6 == null ? null : var6.method4543(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2569;
        if (arg4 != null) {
            var7 |= arg4.field2559 << 16;
        }
        class197 var9 = (class197) field2568.method5586(var7);
        if (var9 == null) {
            class176 var10 = this.method4521(this.field2572, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3424(this.field2599 + 64, this.field2600 + 850, -30, -50, -30);
            field2568.method5589(var9, var7);
        }
        class197 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method4872(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method4869(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method3976(true);
        } else {
            var11 = arg2.method4869(var9, arg3);
        }
        if (this.field2564 != 128 || this.field2601 != 128) {
            var11.method3925(this.field2564, this.field2601, this.field2564);
        }
        return var11;
    }

    @ObfuscatedName("jm.ao(Ljl;I)Lgm;")
    public final class176 method4520(class245 arg0) {
        if (this.field2582 == null) {
            return this.method4521(this.field2573, arg0);
        } else {
            class246 var2 = this.method4522();
            return var2 == null ? null : var2.method4520(arg0);
        }
    }

    @ObfuscatedName("jm.am([ILjl;I)Lgm;")
    public class176 method4521(int[] arg0, class245 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2558 != null) {
            var3 = arg1.field2558;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field2576.method6656(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class176[] var6 = new class176[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class176.method3343(Statics.field2576, var3[var7], 0);
        }
        class176 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class176(var6, var6.length);
            }
        } else {
            var8 = new class176(var6, var6.length);
        }
        if (this.field2610 != null) {
            short[] var9 = this.field2590;
            if (arg1 != null && arg1.field2561 != null) {
                var9 = arg1.field2561;
            }
            for (int var10 = 0; var10 < this.field2610.length; var10++) {
                var8.method3350(this.field2610[var10], var9[var10]);
            }
        }
        if (this.field2591 != null) {
            short[] var11 = this.field2592;
            if (arg1 != null && arg1.field2557 != null) {
                var11 = arg1.field2557;
            }
            for (int var12 = 0; var12 < this.field2591.length; var12++) {
                var8.method3360(this.field2591[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("jm.ac(I)Ljm;")
    public final class246 method4522() {
        int var1 = -1;
        if (this.field2577 != -1) {
            var1 = class349.method3159(this.field2577);
        } else if (this.field2596 != -1) {
            var1 = class349.field3702[this.field2596];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2582.length - 1) {
            var2 = this.field2582[var1];
        } else {
            var2 = this.field2582[this.field2582.length - 1];
        }
        return var2 == -1 ? null : method2916(var2);
    }

    @ObfuscatedName("jm.ae(I)I")
    public final int method4558() {
        if (this.field2582 != null) {
            class246 var1 = this.method4522();
            if (var1 != null) {
                return var1.field2569;
            }
        }
        return -1;
    }

    @ObfuscatedName("jm.ad(I)Z")
    public boolean method4524() {
        if (this.field2582 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2577 != -1) {
            var1 = class349.method3159(this.field2577);
        } else if (this.field2596 != -1) {
            var1 = class349.field3702[this.field2596];
        }
        if (var1 >= 0 && var1 < this.field2582.length) {
            return this.field2582[var1] != -1;
        } else {
            return this.field2582[this.field2582.length - 1] != -1;
        }
    }

    @ObfuscatedName("jm.aq(IIB)I")
    public int method4525(int arg0, int arg1) {
        class521 var3 = this.field2612;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class505 var5 = (class505) var3.method8512((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field5073;
            }
        }
        return var4;
    }

    @ObfuscatedName("jm.al(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4541(int arg0, String arg1) {
        return class239.method6634(this.field2612, arg0, arg1);
    }

    @ObfuscatedName("fc.aj(B)V")
    public static void method3161() {
        field2567.method5588();
        field2568.method5588();
    }

    @ObfuscatedName("jm.as(I)Z")
    public boolean method4526() {
        return this.field2609 != null && this.field2604 != null;
    }

    @ObfuscatedName("jm.aw(I)[I")
    public int[] method4553() {
        return this.field2609;
    }

    @ObfuscatedName("jm.af(II)I")
    public int method4528(int arg0) {
        return this.field2609 == null || arg0 >= this.field2609.length ? -1 : this.field2609[arg0];
    }

    @ObfuscatedName("jm.aa(I)[S")
    public short[] method4533() {
        return this.field2604;
    }

    @ObfuscatedName("jm.ah(II)S")
    public short method4530(int arg0) {
        return this.field2604 == null || arg0 >= this.field2604.length ? -1 : this.field2604[arg0];
    }
}
