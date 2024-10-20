package deob;

@ObfuscatedName("mh")
public class class314 extends class50 {

    @ObfuscatedName("mh.au")
    public class307 field3480;

    @ObfuscatedName("mh.ae")
    public class378 field3485 = new class378();

    @ObfuscatedName("mh.ao")
    public class39 field3481 = new class39();

    public class314(class307 arg0) {
        this.field3480 = arg0;
    }

    @ObfuscatedName("mh.ai()Lbw;")
    public class50 method720() {
        class316 var1 = (class316) this.field3485.method6393();
        if (var1 == null) {
            return null;
        } else if (var1.field3496 == null) {
            return this.method712();
        } else {
            return var1.field3496;
        }
    }

    @ObfuscatedName("mh.az()Lbw;")
    public class50 method712() {
        class316 var1;
        do {
            var1 = (class316) this.field3485.method6395();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3496 == null);
        return var1.field3496;
    }

    @ObfuscatedName("mh.ap()I")
    public int method713() {
        return 0;
    }

    @ObfuscatedName("mh.aa([III)V")
    public void method714(int[] arg0, int arg1, int arg2) {
        this.field3481.method714(arg0, arg1, arg2);
        for (class316 var4 = (class316) this.field3485.method6393(); var4 != null; var4 = (class316) this.field3485.method6395()) {
            if (!this.field3480.method5366(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3507) {
                        this.method5447(var4, arg0, var5, var6, var5 + var6);
                        var4.field3507 -= var6;
                        break;
                    }
                    this.method5447(var4, arg0, var5, var4.field3507, var5 + var6);
                    var5 += var4.field3507;
                    var6 -= var4.field3507;
                } while (!this.field3480.method5303(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("mh.ad(I)V")
    public void method716(int arg0) {
        this.field3481.method716(arg0);
        for (class316 var2 = (class316) this.field3485.method6393(); var2 != null; var2 = (class316) this.field3485.method6395()) {
            if (!this.field3480.method5366(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3507) {
                        this.method5448(var2, var3);
                        var2.field3507 -= var3;
                        break;
                    }
                    this.method5448(var2, var2.field3507);
                    var3 -= var2.field3507;
                } while (!this.field3480.method5303(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("mh.au(Lmg;[IIIII)V")
    public void method5447(class316 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3480.field3414[arg0.field3498] & 0x4) != 0 && arg0.field3502 < 0) {
            int var6 = this.field3480.field3441[arg0.field3498] / Statics.field294;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3508) / var6;
                if (var7 > arg3) {
                    arg0.field3508 += arg3 * var6;
                    break;
                }
                arg0.field3496.method714(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3508 += var6 * var7 - 1048576;
                int var8 = Statics.field294 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3496;
                if (this.field3480.field3416[arg0.field3498] == 0) {
                    arg0.field3496 = class49.method879(arg0.field3490, var10.method893(), var10.method884(), var10.method885());
                } else {
                    arg0.field3496 = class49.method879(arg0.field3490, var10.method893(), 0, var10.method885());
                    this.field3480.method5297(arg0, arg0.field3489.field3469[arg0.field3493] < 0);
                    arg0.field3496.method917(var8, var10.method884());
                }
                if (arg0.field3489.field3469[arg0.field3493] < 0) {
                    arg0.field3496.method880(-1);
                }
                var10.method891(var8);
                var10.method714(arg1, arg2, arg4 - arg2);
                if (var10.method895()) {
                    this.field3481.method734(var10);
                }
            }
        }
        arg0.field3496.method714(arg1, arg2, arg3);
    }

    @ObfuscatedName("mh.ae(Lmg;II)V")
    public void method5448(class316 arg0, int arg1) {
        if ((this.field3480.field3414[arg0.field3498] & 0x4) != 0 && arg0.field3502 < 0) {
            int var3 = this.field3480.field3441[arg0.field3498] / Statics.field294;
            int var4 = (var3 + 1048575 - arg0.field3508) / var3;
            arg0.field3508 = arg0.field3508 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3480.field3416[arg0.field3498] == 0) {
                    arg0.field3496 = class49.method879(arg0.field3490, arg0.field3496.method893(), arg0.field3496.method884(), arg0.field3496.method885());
                } else {
                    arg0.field3496 = class49.method879(arg0.field3490, arg0.field3496.method893(), 0, arg0.field3496.method885());
                    this.field3480.method5297(arg0, arg0.field3489.field3469[arg0.field3493] < 0);
                }
                if (arg0.field3489.field3469[arg0.field3493] < 0) {
                    arg0.field3496.method880(-1);
                }
                arg1 = arg0.field3508 / var3;
            }
        }
        arg0.field3496.method716(arg1);
    }
}
