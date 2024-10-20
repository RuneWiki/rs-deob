package deob;

import java.awt.datatransfer.Clipboard;

@ObfuscatedName("iu")
public class class225 implements class30 {

    @ObfuscatedName("iu.am")
    public class347 field2385 = null;

    @ObfuscatedName("iu.ap")
    public boolean field2386 = false;

    @ObfuscatedName("iu.af")
    public boolean field2387 = false;

    @ObfuscatedName("iu.ax(Lnn;B)V")
    public void method4035(class347 arg0) {
        if (arg0 == null) {
            this.method4040();
            return;
        }
        if (this.field2385 != arg0) {
            this.method4040();
            this.field2385 = arg0;
        }
        class343 var2 = arg0.method6110();
        if (var2 == null) {
            return;
        }
        if (!var2.field3636.method5862() && var2.field3634 != null) {
            class88 var3 = new class88();
            var3.method2267(arg0);
            var3.method2269(var2.field3634);
            Statics.method396().method6666(var3);
        }
        var2.field3636.method5869(true);
    }

    @ObfuscatedName("iu.aw(I)Lnn;")
    public class347 method4036() {
        return this.field2385;
    }

    @ObfuscatedName("iu.az(I)V")
    public void method4040() {
        if (this.field2385 == null) {
            return;
        }
        class343 var1 = this.field2385.method6110();
        class347 var2 = this.field2385;
        this.field2385 = null;
        if (var1 == null) {
            return;
        }
        if (var1.field3636.method5862() && var1.field3634 != null) {
            class88 var3 = new class88();
            var3.method2267(var2);
            var3.method2269(var1.field3634);
            Statics.method396().method6666(var3);
        }
        var1.field3636.method5869(false);
    }

    @ObfuscatedName("iu.am(II)Z")
    public boolean method441(int arg0) {
        if (this.field2385 == null) {
            return false;
        }
        class28 var2 = this.field2385.method6118();
        if (var2 == null) {
            return false;
        }
        if (var2.method393(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2387 = true;
                    break;
                case 82:
                    this.field2386 = true;
                    break;
                default:
                    if (this.method4045(arg0)) {
                        Statics.method5074(this.field2385);
                    }
            }
        }
        return var2.method407(arg0);
    }

    @ObfuscatedName("iu.ap(II)Z")
    public boolean method438(int arg0) {
        switch(arg0) {
            case 81:
                this.field2387 = false;
                return false;
            case 82:
                this.field2386 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("iu.af(CB)Z")
    public boolean method437(char arg0) {
        if (this.field2385 == null) {
            return false;
        }
        boolean var2;
        if (arg0 >= ' ' && arg0 < 127 || arg0 > 127 && arg0 < 160 || arg0 > 160 && arg0 <= 255) {
            var2 = true;
        } else {
            label81: {
                if (arg0 != 0) {
                    char[] var3 = class401.field4492;
                    for (int var4 = 0; var4 < var3.length; var4++) {
                        char var5 = var3[var4];
                        if (arg0 == var5) {
                            var2 = true;
                            break label81;
                        }
                    }
                }
                var2 = false;
            }
        }
        if (!var2) {
            return false;
        }
        class345 var6 = this.field2385.method6094();
        if (var6 == null || !var6.method5866()) {
            return false;
        }
        class28 var7 = this.field2385.method6118();
        if (var7 == null) {
            return false;
        } else {
            if (var7.method394(arg0) && var6.method5828(arg0)) {
                Statics.method5074(this.field2385);
            }
            return var7.method413(arg0);
        }
    }

    @ObfuscatedName("iu.aj(ZI)Z")
    public boolean method444(boolean arg0) {
        return false;
    }

    @ObfuscatedName("iu.av(IB)Z")
    public boolean method4045(int arg0) {
        if (this.field2385 == null) {
            return false;
        }
        class345 var2 = this.field2385.method6094();
        if (var2 == null || !var2.method5866()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method4040();
                return true;
            case 48:
                if (this.field2386) {
                    var2.method5834();
                }
                return true;
            case 65:
                if (this.field2386) {
                    Clipboard var10 = Statics.field3067.method497();
                    var2.method5853(var10);
                }
                return true;
            case 66:
                if (this.field2386) {
                    Clipboard var8 = Statics.field3067.method497();
                    var2.method5852(var8);
                }
                return true;
            case 67:
                if (this.field2386) {
                    Clipboard var6 = Statics.field3067.method497();
                    var2.method5854(var6);
                }
                return true;
            case 84:
                if (var2.method6057() == 0) {
                    var2.method5828(10);
                } else if (this.field2387 && var2.method5876()) {
                    var2.method5828(10);
                } else {
                    class343 var3 = this.field2385.method6110();
                    class88 var4 = new class88();
                    var4.method2267(this.field2385);
                    var4.method2269(var3.field3630);
                    Statics.method396().method6666(var4);
                    this.method4040();
                }
                return true;
            case 85:
                if (this.field2386) {
                    var2.method6012();
                } else {
                    var2.method5939();
                }
                return true;
            case 96:
                if (this.field2386) {
                    var2.method6009(this.field2387);
                } else {
                    var2.method6047(this.field2387);
                }
                return true;
            case 97:
                if (this.field2386) {
                    var2.method5969(this.field2387);
                } else {
                    var2.method5841(this.field2387);
                }
                return true;
            case 98:
                if (this.field2386) {
                    var2.method5952();
                } else {
                    var2.method5844(this.field2387);
                }
                return true;
            case 99:
                if (this.field2386) {
                    var2.method5938();
                } else {
                    var2.method5845(this.field2387);
                }
                return true;
            case 101:
                if (this.field2386) {
                    var2.method5832();
                } else {
                    var2.method6056();
                }
                return true;
            case 102:
                if (this.field2386) {
                    var2.method5838(this.field2387);
                } else {
                    var2.method6076(this.field2387);
                }
                return true;
            case 103:
                if (this.field2386) {
                    var2.method5917(this.field2387);
                } else {
                    var2.method5837(this.field2387);
                }
                return true;
            case 104:
                if (this.field2386) {
                    var2.method5848(this.field2387);
                } else {
                    var2.method5920(this.field2387);
                }
                return true;
            case 105:
                if (this.field2386) {
                    var2.method5849(this.field2387);
                } else {
                    var2.method5993(this.field2387);
                }
                return true;
            default:
                return false;
        }
    }
}
