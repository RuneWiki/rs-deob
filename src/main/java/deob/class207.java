package deob;

import java.awt.datatransfer.Clipboard;

@ObfuscatedName("hi")
public class class207 implements class30 {

    @ObfuscatedName("hi.aj")
    public class313 field2279 = null;

    @ObfuscatedName("hi.al")
    public boolean field2280 = false;

    @ObfuscatedName("hi.ac")
    public boolean field2281 = false;

    @ObfuscatedName("hi.ay(Lmy;I)V")
    public void method3729(class313 arg0) {
        this.method3738();
        if (arg0 == null) {
            return;
        }
        this.field2279 = arg0;
        class309 var2 = arg0.method5611();
        if (var2 == null) {
            return;
        }
        var2.field3459.method5339(true);
        if (var2.field3455 != null) {
            class86 var3 = new class86();
            var3.method2160(arg0);
            var3.method2158(var2.field3455);
            client.method2956().method6111(var3);
        }
    }

    @ObfuscatedName("hi.am(I)Lmy;")
    public class313 method3730() {
        return this.field2279;
    }

    @ObfuscatedName("hi.az(B)V")
    public void method3738() {
        if (this.field2279 == null) {
            return;
        }
        class309 var1 = this.field2279.method5611();
        class313 var2 = this.field2279;
        this.field2279 = null;
        if (var1 == null) {
            return;
        }
        var1.field3459.method5339(false);
        if (var1.field3455 != null) {
            class86 var3 = new class86();
            var3.method2160(var2);
            var3.method2158(var1.field3455);
            client.method2956().method6111(var3);
        }
    }

    @ObfuscatedName("hi.aj(II)Z")
    public boolean method431(int arg0) {
        if (this.field2279 == null) {
            return false;
        }
        class28 var2 = this.field2279.method5568();
        if (var2 == null) {
            return false;
        }
        if (var2.method384(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2281 = true;
                    break;
                case 82:
                    this.field2280 = true;
                    break;
                default:
                    if (this.method3732(arg0)) {
                        client.method1946(this.field2279);
                    }
            }
        }
        return var2.method382(arg0);
    }

    @ObfuscatedName("hi.al(II)Z")
    public boolean method424(int arg0) {
        switch(arg0) {
            case 81:
                this.field2281 = false;
                return false;
            case 82:
                this.field2280 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("hi.ac(CI)Z")
    public boolean method425(char arg0) {
        if (this.field2279 == null) {
            return false;
        } else if (class366.method674(arg0)) {
            class311 var2 = this.field2279.method5566();
            if (var2 == null || !var2.method5321()) {
                return false;
            }
            class28 var3 = this.field2279.method5568();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method385(arg0) && var2.method5282(arg0)) {
                    client.method1946(this.field2279);
                }
                return var3.method383(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("hi.ab(ZB)Z")
    public boolean method426(boolean arg0) {
        return false;
    }

    @ObfuscatedName("hi.ae(II)Z")
    public boolean method3732(int arg0) {
        if (this.field2279 == null) {
            return false;
        }
        class311 var2 = this.field2279.method5566();
        if (var2 == null || !var2.method5321()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3738();
                return true;
            case 48:
                if (this.field2280) {
                    var2.method5288();
                }
                return true;
            case 65:
                if (this.field2280) {
                    Clipboard var10 = Statics.field4480.method476();
                    var2.method5504(var10);
                }
                return true;
            case 66:
                if (this.field2280) {
                    Clipboard var8 = Statics.field4480.method476();
                    var2.method5306(var8);
                }
                return true;
            case 67:
                if (this.field2280) {
                    Clipboard var6 = Statics.field4480.method476();
                    var2.method5308(var6);
                }
                return true;
            case 84:
                if (var2.method5327() == 0) {
                    var2.method5282(10);
                } else if (this.field2281 && var2.method5341()) {
                    var2.method5282(10);
                } else {
                    class309 var3 = this.field2279.method5611();
                    class86 var4 = new class86();
                    var4.method2160(this.field2279);
                    var4.method2158(var3.field3454);
                    client.method2956().method6111(var4);
                    this.method3738();
                }
                return true;
            case 85:
                if (this.field2280) {
                    var2.method5285();
                } else {
                    var2.method5283();
                }
                return true;
            case 96:
                if (this.field2280) {
                    var2.method5296(this.field2281);
                } else {
                    var2.method5294(this.field2281);
                }
                return true;
            case 97:
                if (this.field2280) {
                    var2.method5396(this.field2281);
                } else {
                    var2.method5295(this.field2281);
                }
                return true;
            case 98:
                if (this.field2280) {
                    var2.method5309();
                } else {
                    var2.method5271(this.field2281);
                }
                return true;
            case 99:
                if (this.field2280) {
                    var2.method5307();
                } else {
                    var2.method5402(this.field2281);
                }
                return true;
            case 101:
                if (this.field2280) {
                    var2.method5317();
                } else {
                    var2.method5284();
                }
                return true;
            case 102:
                if (this.field2280) {
                    var2.method5345(this.field2281);
                } else {
                    var2.method5426(this.field2281);
                }
                return true;
            case 103:
                if (this.field2280) {
                    var2.method5293(this.field2281);
                } else {
                    var2.method5495(this.field2281);
                }
                return true;
            case 104:
                if (this.field2280) {
                    var2.method5460(this.field2281);
                } else {
                    var2.method5325(this.field2281);
                }
                return true;
            case 105:
                if (this.field2280) {
                    var2.method5303(this.field2281);
                } else {
                    var2.method5362(this.field2281);
                }
                return true;
            default:
                return false;
        }
    }
}
