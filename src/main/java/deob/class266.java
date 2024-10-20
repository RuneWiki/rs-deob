package deob;

import java.awt.datatransfer.Clipboard;

@ObfuscatedName("kf")
public class class266 implements class30 {

    @ObfuscatedName("kf.ab")
    public class361 field2906 = null;

    @ObfuscatedName("kf.ay")
    public boolean field2907 = false;

    @ObfuscatedName("kf.an")
    public boolean field2908 = false;

    @ObfuscatedName("kf.aw(Lnq;I)V")
    public void method4917(class361 arg0) {
        if (arg0 == null) {
            this.method4931();
            return;
        }
        if (this.field2906 != arg0) {
            this.method4931();
            this.field2906 = arg0;
        }
        class357 var2 = arg0.method6394();
        if (var2 == null) {
            return;
        }
        if (!var2.field3731.method6111() && var2.field3735 != null) {
            class90 var3 = new class90();
            var3.method2334(arg0);
            var3.method2325(var2.field3735);
            client.method5981().method6892(var3);
        }
        var2.field3731.method6060(true);
    }

    @ObfuscatedName("kf.af(I)Lnq;")
    public class361 method4921() {
        return this.field2906;
    }

    @ObfuscatedName("kf.aa(I)V")
    public void method4931() {
        if (this.field2906 == null) {
            return;
        }
        class357 var1 = this.field2906.method6394();
        class361 var2 = this.field2906;
        this.field2906 = null;
        if (var1 == null) {
            return;
        }
        if (var1.field3731.method6111() && var1.field3735 != null) {
            class90 var3 = new class90();
            var3.method2334(var2);
            var3.method2325(var1.field3735);
            client.method5981().method6892(var3);
        }
        var1.field3731.method6060(false);
    }

    @ObfuscatedName("kf.ab(IB)Z")
    public boolean method402(int arg0) {
        if (this.field2906 == null) {
            return false;
        }
        class28 var2 = this.field2906.method6393();
        if (var2 == null) {
            return false;
        }
        if (var2.method363(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2908 = true;
                    break;
                case 82:
                    this.field2907 = true;
                    break;
                default:
                    if (this.method4920(arg0)) {
                        client.method7116(this.field2906);
                    }
            }
        }
        return var2.method361(arg0);
    }

    @ObfuscatedName("kf.ay(II)Z")
    public boolean method400(int arg0) {
        switch(arg0) {
            case 81:
                this.field2908 = false;
                return false;
            case 82:
                this.field2907 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("kf.an(CI)Z")
    public boolean method405(char arg0) {
        if (this.field2906 == null) {
            return false;
        } else if (Statics.method6769(arg0)) {
            class359 var2 = this.field2906.method6391();
            if (var2 == null || !var2.method6263()) {
                return false;
            }
            class28 var3 = this.field2906.method6393();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method360(arg0) && var2.method6144(arg0)) {
                    client.method7116(this.field2906);
                }
                return var3.method394(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("kf.au(ZI)Z")
    public boolean method399(boolean arg0) {
        return false;
    }

    @ObfuscatedName("kf.ah(II)Z")
    public boolean method4920(int arg0) {
        if (this.field2906 == null) {
            return false;
        }
        class359 var2 = this.field2906.method6391();
        if (var2 == null || !var2.method6263()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method4931();
                return true;
            case 48:
                if (this.field2907) {
                    var2.method6083();
                }
                return true;
            case 65:
                if (this.field2907) {
                    Clipboard var10 = Statics.field997.method476();
                    var2.method6102(var10);
                }
                return true;
            case 66:
                if (this.field2907) {
                    Clipboard var8 = Statics.field997.method476();
                    var2.method6209(var8);
                }
                return true;
            case 67:
                if (this.field2907) {
                    Clipboard var6 = Statics.field997.method476();
                    var2.method6103(var6);
                }
                return true;
            case 84:
                if (var2.method6122() == 0) {
                    var2.method6144(10);
                } else if (this.field2908 && var2.method6126()) {
                    var2.method6144(10);
                } else {
                    class357 var3 = this.field2906.method6394();
                    class90 var4 = new class90();
                    var4.method2334(this.field2906);
                    var4.method2325(var3.field3737);
                    client.method5981().method6892(var4);
                    this.method4931();
                }
                return true;
            case 85:
                if (this.field2907) {
                    var2.method6080();
                } else {
                    var2.method6207();
                }
                return true;
            case 96:
                if (this.field2907) {
                    var2.method6166(this.field2908);
                } else {
                    var2.method6309(this.field2908);
                }
                return true;
            case 97:
                if (this.field2907) {
                    var2.method6092(this.field2908);
                } else {
                    var2.method6105(this.field2908);
                }
                return true;
            case 98:
                if (this.field2907) {
                    var2.method6162();
                } else {
                    var2.method6093(this.field2908);
                }
                return true;
            case 99:
                if (this.field2907) {
                    var2.method6276();
                } else {
                    var2.method6094(this.field2908);
                }
                return true;
            case 101:
                if (this.field2907) {
                    var2.method6081();
                } else {
                    var2.method6079();
                }
                return true;
            case 102:
                if (this.field2907) {
                    var2.method6095(this.field2908);
                } else {
                    var2.method6085(this.field2908);
                }
                return true;
            case 103:
                if (this.field2907) {
                    var2.method6088(this.field2908);
                } else {
                    var2.method6086(this.field2908);
                }
                return true;
            case 104:
                if (this.field2907) {
                    var2.method6064(this.field2908);
                } else {
                    var2.method6243(this.field2908);
                }
                return true;
            case 105:
                if (this.field2907) {
                    var2.method6146(this.field2908);
                } else {
                    var2.method6096(this.field2908);
                }
                return true;
            default:
                return false;
        }
    }
}
