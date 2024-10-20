package deob;

@ObfuscatedName("ni")
public class class341 extends class50 {

    @ObfuscatedName("ni.ab")
    public class334 field3643;

    @ObfuscatedName("ni.ay")
    public class408 field3640 = new class408();

    @ObfuscatedName("ni.an")
    public class39 field3642 = new class39();

    public class341(class334 arg0) {
        this.field3643 = arg0;
    }

    @ObfuscatedName("ni.ao()Lbb;")
    public class50 method705() {
        class343 var1 = (class343) this.field3640.method6907();
        if (var1 == null) {
            return null;
        } else if (var1.field3665 == null) {
            return this.method687();
        } else {
            return var1.field3665;
        }
    }

    @ObfuscatedName("ni.am()Lbb;")
    public class50 method687() {
        class343 var1;
        do {
            var1 = (class343) this.field3640.method6896();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3665 == null);
        return var1.field3665;
    }

    @ObfuscatedName("ni.ac()I")
    public int method682() {
        return 0;
    }

    @ObfuscatedName("ni.ae([III)V")
    public void method683(int[] arg0, int arg1, int arg2) {
        this.field3642.method683(arg0, arg1, arg2);
        for (class343 var4 = (class343) this.field3640.method6907(); var4 != null; var4 = (class343) this.field3640.method6896()) {
            if (!this.field3643.method5722(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3652) {
                        this.method5882(var4, arg0, var5, var6, var5 + var6);
                        var4.field3652 -= var6;
                        break;
                    }
                    this.method5882(var4, arg0, var5, var4.field3652, var5 + var6);
                    var5 += var4.field3652;
                    var6 -= var4.field3652;
                } while (!this.field3643.method5723(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ni.aq(I)V")
    public void method693(int arg0) {
        this.field3642.method693(arg0);
        for (class343 var2 = (class343) this.field3640.method6907(); var2 != null; var2 = (class343) this.field3640.method6896()) {
            if (!this.field3643.method5722(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3652) {
                        this.method5883(var2, var3);
                        var2.field3652 -= var3;
                        break;
                    }
                    this.method5883(var2, var2.field3652);
                    var3 -= var2.field3652;
                } while (!this.field3643.method5723(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ni.ab(Lno;[IIIIB)V")
    public void method5882(class343 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3643.field3586[arg0.field3653] & 0x4) != 0 && arg0.field3661 < 0) {
            int var6 = this.field3643.field3591[arg0.field3653] / Statics.field5137;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3667) / var6;
                if (var7 > arg3) {
                    arg0.field3667 += arg3 * var6;
                    break;
                }
                arg0.field3665.method683(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3667 += var6 * var7 - 1048576;
                int var8 = Statics.field5137 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3665;
                if (this.field3643.field3589[arg0.field3653] == 0) {
                    arg0.field3665 = class49.method830(arg0.field3649, var10.method840(), var10.method831(), var10.method837());
                } else {
                    arg0.field3665 = class49.method830(arg0.field3649, var10.method840(), 0, var10.method837());
                    this.field3643.method5717(arg0, arg0.field3659.field3635[arg0.field3658] < 0);
                    arg0.field3665.method878(var8, var10.method831());
                }
                if (arg0.field3659.field3635[arg0.field3658] < 0) {
                    arg0.field3665.method832(-1);
                }
                var10.method962(var8);
                var10.method683(arg1, arg2, arg4 - arg2);
                if (var10.method846()) {
                    this.field3642.method675(var10);
                }
            }
        }
        arg0.field3665.method683(arg1, arg2, arg3);
    }

    @ObfuscatedName("ni.ay(Lno;II)V")
    public void method5883(class343 arg0, int arg1) {
        if ((this.field3643.field3586[arg0.field3653] & 0x4) != 0 && arg0.field3661 < 0) {
            int var3 = this.field3643.field3591[arg0.field3653] / Statics.field5137;
            int var4 = (var3 + 1048575 - arg0.field3667) / var3;
            arg0.field3667 = arg0.field3667 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3643.field3589[arg0.field3653] == 0) {
                    arg0.field3665 = class49.method830(arg0.field3649, arg0.field3665.method840(), arg0.field3665.method831(), arg0.field3665.method837());
                } else {
                    arg0.field3665 = class49.method830(arg0.field3649, arg0.field3665.method840(), 0, arg0.field3665.method837());
                    this.field3643.method5717(arg0, arg0.field3659.field3635[arg0.field3658] < 0);
                }
                if (arg0.field3659.field3635[arg0.field3658] < 0) {
                    arg0.field3665.method832(-1);
                }
                arg1 = arg0.field3667 / var3;
            }
        }
        arg0.field3665.method693(arg1);
    }
}
