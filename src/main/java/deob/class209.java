package deob;

@ObfuscatedName("ht")
public class class209 extends class120 {

    @ObfuscatedName("ht.p")
    public class205 field2602;

    @ObfuscatedName("ht.m")
    public class194 field2600 = new class194();

    @ObfuscatedName("ht.e")
    public class103 field2604 = new class103();

    public class209(class205 arg0) {
        this.field2602 = arg0;
    }

    @ObfuscatedName("ht.z()Ldb;")
    public class120 method1668() {
        class206 var1 = (class206) this.field2600.method3252();
        if (var1 == null) {
            return null;
        } else if (var1.field2566 == null) {
            return this.method1669();
        } else {
            return var1.field2566;
        }
    }

    @ObfuscatedName("ht.j()Ldb;")
    public class120 method1669() {
        class206 var1;
        do {
            var1 = (class206) this.field2600.method3277();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2566 == null);
        return var1.field2566;
    }

    @ObfuscatedName("ht.c()I")
    public int method1670() {
        return 0;
    }

    @ObfuscatedName("ht.o([III)V")
    public void method1671(int[] arg0, int arg1, int arg2) {
        this.field2604.method1671(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2600.method3252(); var4 != null; var4 = (class206) this.field2600.method3277()) {
            if (!this.field2602.method3338(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2574) {
                        this.method3519(var4, arg0, var5, var6, var5 + var6);
                        var4.field2574 -= var6;
                        break;
                    }
                    this.method3519(var4, arg0, var5, var4.field2574, var5 + var6);
                    var5 += var4.field2574;
                    var6 -= var4.field2574;
                } while (!this.field2602.method3367(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ht.n(I)V")
    public void method1673(int arg0) {
        this.field2604.method1673(arg0);
        for (class206 var2 = (class206) this.field2600.method3252(); var2 != null; var2 = (class206) this.field2600.method3277()) {
            if (!this.field2602.method3338(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2574) {
                        this.method3517(var2, var3);
                        var2.field2574 -= var3;
                        break;
                    }
                    this.method3517(var2, var2.field2574);
                    var3 -= var2.field2574;
                } while (!this.field2602.method3367(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ht.p(Lgn;[IIIII)V")
    public void method3519(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2602.field2538[arg0.field2576] & 0x4) != 0 && arg0.field2573 < 0) {
            int var6 = this.field2602.field2543[arg0.field2576] / Statics.field1636;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2569) / var6;
                if (var7 > arg3) {
                    arg0.field2569 += arg3 * var6;
                    break;
                }
                arg0.field2566.method1671(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2569 += var6 * var7 - 1048576;
                int var8 = Statics.field1636 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2566;
                if (this.field2602.field2553[arg0.field2576] == 0) {
                    arg0.field2566 = class118.method1904(arg0.field2560, var10.method1972(), var10.method1956(), var10.method1910());
                } else {
                    arg0.field2566 = class118.method1904(arg0.field2560, var10.method1972(), 0, var10.method1910());
                    this.field2602.method3368(arg0, arg0.field2556.field2591[arg0.field2575] < 0);
                    arg0.field2566.method1914(var8, var10.method1956());
                }
                if (arg0.field2556.field2591[arg0.field2575] < 0) {
                    arg0.field2566.method1996(-1);
                }
                var10.method1916(var8);
                var10.method1671(arg1, arg2, arg4 - arg2);
                if (var10.method1998()) {
                    this.field2604.method1690(var10);
                }
            }
        }
        arg0.field2566.method1671(arg1, arg2, arg3);
    }

    @ObfuscatedName("ht.m(Lgn;IB)V")
    public void method3517(class206 arg0, int arg1) {
        if ((this.field2602.field2538[arg0.field2576] & 0x4) != 0 && arg0.field2573 < 0) {
            int var3 = this.field2602.field2543[arg0.field2576] / Statics.field1636;
            int var4 = (var3 + 1048575 - arg0.field2569) / var3;
            arg0.field2569 = arg0.field2569 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2602.field2553[arg0.field2576] == 0) {
                    arg0.field2566 = class118.method1904(arg0.field2560, arg0.field2566.method1972(), arg0.field2566.method1956(), arg0.field2566.method1910());
                } else {
                    arg0.field2566 = class118.method1904(arg0.field2560, arg0.field2566.method1972(), 0, arg0.field2566.method1910());
                    this.field2602.method3368(arg0, arg0.field2556.field2591[arg0.field2575] < 0);
                }
                if (arg0.field2556.field2591[arg0.field2575] < 0) {
                    arg0.field2566.method1996(-1);
                }
                arg1 = arg0.field2569 / var3;
            }
        }
        arg0.field2566.method1673(arg1);
    }
}
