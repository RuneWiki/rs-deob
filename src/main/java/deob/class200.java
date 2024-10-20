package deob;

import java.awt.datatransfer.Clipboard;

@ObfuscatedName("gb")
public class class200 implements class31 {

    @ObfuscatedName("gb.h")
    public class306 field2306 = null;

    @ObfuscatedName("gb.e")
    public boolean field2305 = false;

    @ObfuscatedName("gb.v")
    public boolean field2307 = false;

    @ObfuscatedName("gb.a(Lkd;I)V")
    public void method3716(class306 arg0) {
        this.method3718();
        if (arg0 == null) {
            return;
        }
        this.field2306 = arg0;
        class302 var2 = arg0.method5599();
        if (var2 == null) {
            return;
        }
        var2.field3467.method5294(true);
        if (var2.field3468 != null) {
            class85 var3 = new class85();
            var3.method2141(arg0);
            var3.method2139(var2.field3468);
            client.method4224().method6081(var3);
        }
    }

    @ObfuscatedName("gb.s(B)Lkd;")
    public class306 method3717() {
        return this.field2306;
    }

    @ObfuscatedName("gb.l(B)V")
    public void method3718() {
        if (this.field2306 == null) {
            return;
        }
        class302 var1 = this.field2306.method5599();
        class306 var2 = this.field2306;
        this.field2306 = null;
        if (var1 == null) {
            return;
        }
        var1.field3467.method5294(false);
        if (var1.field3468 != null) {
            class85 var3 = new class85();
            var3.method2141(var2);
            var3.method2139(var1.field3468);
            client.method4224().method6081(var3);
        }
    }

    @ObfuscatedName("gb.h(II)Z")
    public boolean method432(int arg0) {
        if (this.field2306 == null) {
            return false;
        }
        class29 var2 = this.field2306.method5601();
        if (var2 == null) {
            return false;
        }
        if (var2.method392(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2307 = true;
                    break;
                case 82:
                    this.field2305 = true;
                    break;
                default:
                    if (this.method3719(arg0)) {
                        client.method1922(this.field2306);
                    }
            }
        }
        return var2.method413(arg0);
    }

    @ObfuscatedName("gb.e(II)Z")
    public boolean method433(int arg0) {
        switch(arg0) {
            case 81:
                this.field2307 = false;
                return false;
            case 82:
                this.field2305 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("gb.v(CI)Z")
    public boolean method427(char arg0) {
        if (this.field2306 == null) {
            return false;
        } else if (class359.method1763(arg0)) {
            class304 var2 = this.field2306.method5581();
            if (var2 == null || !var2.method5476()) {
                return false;
            }
            class29 var3 = this.field2306.method5601();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method402(arg0) && var2.method5311(arg0)) {
                    client.method1922(this.field2306);
                }
                return var3.method389(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("gb.x(ZI)Z")
    public boolean method428(boolean arg0) {
        return false;
    }

    @ObfuscatedName("gb.t(II)Z")
    public boolean method3719(int arg0) {
        if (this.field2306 == null) {
            return false;
        }
        class304 var2 = this.field2306.method5581();
        if (var2 == null || !var2.method5476()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3718();
                return true;
            case 48:
                if (this.field2305) {
                    var2.method5530();
                }
                return true;
            case 65:
                if (this.field2305) {
                    Clipboard var10 = Statics.field1488.method489();
                    var2.method5336(var10);
                }
                return true;
            case 66:
                if (this.field2305) {
                    Clipboard var8 = Statics.field1488.method489();
                    var2.method5448(var8);
                }
                return true;
            case 67:
                if (this.field2305) {
                    Clipboard var6 = Statics.field1488.method489();
                    var2.method5337(var6);
                }
                return true;
            case 84:
                if (var2.method5356() == 0) {
                    var2.method5311(10);
                } else if (this.field2307 && var2.method5360()) {
                    var2.method5311(10);
                } else {
                    class302 var3 = this.field2306.method5599();
                    class85 var4 = new class85();
                    var4.method2141(this.field2306);
                    var4.method2139(var3.field3466);
                    client.method4224().method6081(var4);
                    this.method3718();
                }
                return true;
            case 85:
                if (this.field2305) {
                    var2.method5314();
                } else {
                    var2.method5312();
                }
                return true;
            case 96:
                if (this.field2305) {
                    var2.method5325(this.field2307);
                } else {
                    var2.method5323(this.field2307);
                }
                return true;
            case 97:
                if (this.field2305) {
                    var2.method5317(this.field2307);
                } else {
                    var2.method5324(this.field2307);
                }
                return true;
            case 98:
                if (this.field2305) {
                    var2.method5338();
                } else {
                    var2.method5442(this.field2307);
                }
                return true;
            case 99:
                if (this.field2305) {
                    var2.method5415();
                } else {
                    var2.method5349(this.field2307);
                }
                return true;
            case 101:
                if (this.field2305) {
                    var2.method5315();
                } else {
                    var2.method5313();
                }
                return true;
            case 102:
                if (this.field2305) {
                    var2.method5321(this.field2307);
                } else {
                    var2.method5557(this.field2307);
                }
                return true;
            case 103:
                if (this.field2305) {
                    var2.method5322(this.field2307);
                } else {
                    var2.method5320(this.field2307);
                }
                return true;
            case 104:
                if (this.field2305) {
                    var2.method5331(this.field2307);
                } else {
                    var2.method5329(this.field2307);
                }
                return true;
            case 105:
                if (this.field2305) {
                    var2.method5332(this.field2307);
                } else {
                    var2.method5330(this.field2307);
                }
                return true;
            default:
                return false;
        }
    }
}
