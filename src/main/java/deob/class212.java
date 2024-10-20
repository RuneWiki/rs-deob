package deob;

@ObfuscatedName("hf")
public class class212 extends class120 {

    @ObfuscatedName("hf.s")
    public class208 field2614;

    @ObfuscatedName("hf.c")
    public class197 field2610 = new class197();

    @ObfuscatedName("hf.f")
    public class103 field2611 = new class103();

    public class212(class208 arg0) {
        this.field2614 = arg0;
    }

    @ObfuscatedName("hf.t()Lds;")
    public class120 method1797() {
        class209 var1 = (class209) this.field2610.method3389();
        if (var1 == null) {
            return null;
        } else if (var1.field2579 == null) {
            return this.method1778();
        } else {
            return var1.field2579;
        }
    }

    @ObfuscatedName("hf.p()Lds;")
    public class120 method1778() {
        class209 var1;
        do {
            var1 = (class209) this.field2610.method3385();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2579 == null);
        return var1.field2579;
    }

    @ObfuscatedName("hf.d()I")
    public int method1770() {
        return 0;
    }

    @ObfuscatedName("hf.n([III)V")
    public void method1773(int[] arg0, int arg1, int arg2) {
        this.field2611.method1773(arg0, arg1, arg2);
        for (class209 var4 = (class209) this.field2610.method3389(); var4 != null; var4 = (class209) this.field2610.method3385()) {
            if (!this.field2614.method3513(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2569) {
                        this.method3656(var4, arg0, var5, var6, var5 + var6);
                        var4.field2569 -= var6;
                        break;
                    }
                    this.method3656(var4, arg0, var5, var4.field2569, var5 + var6);
                    var5 += var4.field2569;
                    var6 -= var4.field2569;
                } while (!this.field2614.method3514(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hf.o(I)V")
    public void method1775(int arg0) {
        this.field2611.method1775(arg0);
        for (class209 var2 = (class209) this.field2610.method3389(); var2 != null; var2 = (class209) this.field2610.method3385()) {
            if (!this.field2614.method3513(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2569) {
                        this.method3657(var2, var3);
                        var2.field2569 -= var3;
                        break;
                    }
                    this.method3657(var2, var2.field2569);
                    var3 -= var2.field2569;
                } while (!this.field2614.method3514(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hf.s(Lhy;[IIIII)V")
    public void method3656(class209 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2614.field2559[arg0.field2574] & 0x4) != 0 && arg0.field2580 < 0) {
            int var6 = this.field2614.field2550[arg0.field2574] / Statics.field1634;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2581) / var6;
                if (var7 > arg3) {
                    arg0.field2581 += arg3 * var6;
                    break;
                }
                arg0.field2579.method1773(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2581 += var6 * var7 - 1048576;
                int var8 = Statics.field1634 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2579;
                if (this.field2614.field2546[arg0.field2574] == 0) {
                    arg0.field2579 = class118.method1992(arg0.field2563, var10.method2004(), var10.method2003(), var10.method1998());
                } else {
                    arg0.field2579 = class118.method1992(arg0.field2563, var10.method2004(), 0, var10.method1998());
                    this.field2614.method3497(arg0, arg0.field2562.field2599[arg0.field2575] < 0);
                    arg0.field2579.method2000(var8, var10.method2003());
                }
                if (arg0.field2562.field2599[arg0.field2575] < 0) {
                    arg0.field2579.method2072(-1);
                }
                var10.method1997(var8);
                var10.method1773(arg1, arg2, arg4 - arg2);
                if (var10.method2006()) {
                    this.field2611.method1800(var10);
                }
            }
        }
        arg0.field2579.method1773(arg1, arg2, arg3);
    }

    @ObfuscatedName("hf.c(Lhy;II)V")
    public void method3657(class209 arg0, int arg1) {
        if ((this.field2614.field2559[arg0.field2574] & 0x4) != 0 && arg0.field2580 < 0) {
            int var3 = this.field2614.field2550[arg0.field2574] / Statics.field1634;
            int var4 = (var3 + 1048575 - arg0.field2581) / var3;
            arg0.field2581 = arg0.field2581 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2614.field2546[arg0.field2574] == 0) {
                    arg0.field2579 = class118.method1992(arg0.field2563, arg0.field2579.method2004(), arg0.field2579.method2003(), arg0.field2579.method1998());
                } else {
                    arg0.field2579 = class118.method1992(arg0.field2563, arg0.field2579.method2004(), 0, arg0.field2579.method1998());
                    this.field2614.method3497(arg0, arg0.field2562.field2599[arg0.field2575] < 0);
                }
                if (arg0.field2562.field2599[arg0.field2575] < 0) {
                    arg0.field2579.method2072(-1);
                }
                arg1 = arg0.field2581 / var3;
            }
        }
        arg0.field2579.method1775(arg1);
    }
}
