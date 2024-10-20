package deob;

@ObfuscatedName("mn")
public class class328 extends class50 {

    @ObfuscatedName("mn.ac")
    public class321 field3508;

    @ObfuscatedName("mn.al")
    public class393 field3510 = new class393();

    @ObfuscatedName("mn.ak")
    public class39 field3513 = new class39();

    public class328(class321 arg0) {
        this.field3508 = arg0;
    }

    @ObfuscatedName("mn.ah()Lbi;")
    public class50 method696() {
        class330 var1 = (class330) this.field3510.method6532();
        if (var1 == null) {
            return null;
        } else if (var1.field3524 == null) {
            return this.method729();
        } else {
            return var1.field3524;
        }
    }

    @ObfuscatedName("mn.ar()Lbi;")
    public class50 method729() {
        class330 var1;
        do {
            var1 = (class330) this.field3510.method6543();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3524 == null);
        return var1.field3524;
    }

    @ObfuscatedName("mn.ab()I")
    public int method698() {
        return 0;
    }

    @ObfuscatedName("mn.am([III)V")
    public void method699(int[] arg0, int arg1, int arg2) {
        this.field3513.method699(arg0, arg1, arg2);
        for (class330 var4 = (class330) this.field3510.method6532(); var4 != null; var4 = (class330) this.field3510.method6543()) {
            if (!this.field3508.method5471(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3537) {
                        this.method5586(var4, arg0, var5, var6, var5 + var6);
                        var4.field3537 -= var6;
                        break;
                    }
                    this.method5586(var4, arg0, var5, var4.field3537, var5 + var6);
                    var5 += var4.field3537;
                    var6 -= var4.field3537;
                } while (!this.field3508.method5445(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("mn.ag(I)V")
    public void method691(int arg0) {
        this.field3513.method691(arg0);
        for (class330 var2 = (class330) this.field3510.method6532(); var2 != null; var2 = (class330) this.field3510.method6543()) {
            if (!this.field3508.method5471(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3537) {
                        this.method5591(var2, var3);
                        var2.field3537 -= var3;
                        break;
                    }
                    this.method5591(var2, var2.field3537);
                    var3 -= var2.field3537;
                } while (!this.field3508.method5445(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("mn.ac(Lms;[IIIII)V")
    public void method5586(class330 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3508.field3458[arg0.field3517] & 0x4) != 0 && arg0.field3525 < 0) {
            int var6 = this.field3508.field3476[arg0.field3517] / Statics.field307;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3536) / var6;
                if (var7 > arg3) {
                    arg0.field3536 += arg3 * var6;
                    break;
                }
                arg0.field3524.method699(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3536 += var6 * var7 - 1048576;
                int var8 = Statics.field307 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3524;
                if (this.field3508.field3461[arg0.field3517] == 0) {
                    arg0.field3524 = class49.method896(arg0.field3516, var10.method862(), var10.method853(), var10.method882());
                } else {
                    arg0.field3524 = class49.method896(arg0.field3516, var10.method862(), 0, var10.method882());
                    this.field3508.method5424(arg0, arg0.field3533.field3499[arg0.field3521] < 0);
                    arg0.field3524.method858(var8, var10.method853());
                }
                if (arg0.field3533.field3499[arg0.field3521] < 0) {
                    arg0.field3524.method867(-1);
                }
                var10.method860(var8);
                var10.method699(arg1, arg2, arg4 - arg2);
                if (var10.method870()) {
                    this.field3513.method725(var10);
                }
            }
        }
        arg0.field3524.method699(arg1, arg2, arg3);
    }

    @ObfuscatedName("mn.al(Lms;II)V")
    public void method5591(class330 arg0, int arg1) {
        if ((this.field3508.field3458[arg0.field3517] & 0x4) != 0 && arg0.field3525 < 0) {
            int var3 = this.field3508.field3476[arg0.field3517] / Statics.field307;
            int var4 = (var3 + 1048575 - arg0.field3536) / var3;
            arg0.field3536 = arg0.field3536 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3508.field3461[arg0.field3517] == 0) {
                    arg0.field3524 = class49.method896(arg0.field3516, arg0.field3524.method862(), arg0.field3524.method853(), arg0.field3524.method882());
                } else {
                    arg0.field3524 = class49.method896(arg0.field3516, arg0.field3524.method862(), 0, arg0.field3524.method882());
                    this.field3508.method5424(arg0, arg0.field3533.field3499[arg0.field3521] < 0);
                }
                if (arg0.field3533.field3499[arg0.field3521] < 0) {
                    arg0.field3524.method867(-1);
                }
                arg1 = arg0.field3536 / var3;
            }
        }
        arg0.field3524.method691(arg1);
    }
}
