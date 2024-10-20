package deob;

import java.awt.datatransfer.Clipboard;

@ObfuscatedName("ib")
public class class225 implements class30 {

    @ObfuscatedName("ib.ac")
    public class347 field2365 = null;

    @ObfuscatedName("ib.al")
    public boolean field2361 = false;

    @ObfuscatedName("ib.ak")
    public boolean field2363 = false;

    @ObfuscatedName("ib.aw(Lnm;I)V")
    public void method3899(class347 arg0) {
        this.method3902();
        if (arg0 == null) {
            return;
        }
        this.field2365 = arg0;
        class343 var2 = arg0.method6016();
        if (var2 == null) {
            return;
        }
        var2.field3607.method5703(true);
        if (var2.field3609 != null) {
            class90 var3 = new class90();
            var3.method2218(arg0);
            var3.method2219(var2.field3609);
            client.method55().method6526(var3);
        }
    }

    @ObfuscatedName("ib.aq(B)Lnm;")
    public class347 method3900() {
        return this.field2365;
    }

    @ObfuscatedName("ib.az(B)V")
    public void method3902() {
        if (this.field2365 == null) {
            return;
        }
        class343 var1 = this.field2365.method6016();
        class347 var2 = this.field2365;
        this.field2365 = null;
        if (var1 == null) {
            return;
        }
        var1.field3607.method5703(false);
        if (var1.field3609 != null) {
            class90 var3 = new class90();
            var3.method2218(var2);
            var3.method2219(var1.field3609);
            client.method55().method6526(var3);
        }
    }

    @ObfuscatedName("ib.ac(II)Z")
    public boolean method430(int arg0) {
        if (this.field2365 == null) {
            return false;
        }
        class28 var2 = this.field2365.method5990();
        if (var2 == null) {
            return false;
        }
        if (var2.method378(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2363 = true;
                    break;
                case 82:
                    this.field2361 = true;
                    break;
                default:
                    if (this.method3901(arg0)) {
                        client.method2979(this.field2365);
                    }
            }
        }
        return var2.method367(arg0);
    }

    @ObfuscatedName("ib.al(II)Z")
    public boolean method413(int arg0) {
        switch(arg0) {
            case 81:
                this.field2363 = false;
                return false;
            case 82:
                this.field2361 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("ib.ak(CB)Z")
    public boolean method422(char arg0) {
        if (this.field2365 == null) {
            return false;
        }
        boolean var2;
        if (arg0 >= ' ' && arg0 < 127 || arg0 > 127 && arg0 < 160 || arg0 > 160 && arg0 <= 255) {
            var2 = true;
        } else {
            label81: {
                if (arg0 != 0) {
                    char[] var3 = class400.field4475;
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
        class345 var6 = this.field2365.method6013();
        if (var6 == null || !var6.method5759()) {
            return false;
        }
        class28 var7 = this.field2365.method5990();
        if (var7 == null) {
            return false;
        } else {
            if (var7.method370(arg0) && var6.method5732(arg0)) {
                client.method2979(this.field2365);
            }
            return var7.method368(arg0);
        }
    }

    @ObfuscatedName("ib.ax(ZI)Z")
    public boolean method415(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ib.at(II)Z")
    public boolean method3901(int arg0) {
        if (this.field2365 == null) {
            return false;
        }
        class345 var2 = this.field2365.method6013();
        if (var2 == null || !var2.method5759()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3902();
                return true;
            case 48:
                if (this.field2361) {
                    var2.method5726();
                }
                return true;
            case 65:
                if (this.field2361) {
                    Clipboard var10 = Statics.field1743.method476();
                    var2.method5853(var10);
                }
                return true;
            case 66:
                if (this.field2361) {
                    Clipboard var8 = Statics.field1743.method476();
                    var2.method5744(var8);
                }
                return true;
            case 67:
                if (this.field2361) {
                    Clipboard var6 = Statics.field1743.method476();
                    var2.method5907(var6);
                }
                return true;
            case 84:
                if (var2.method5701() == 0) {
                    var2.method5732(10);
                } else if (this.field2363 && var2.method5769()) {
                    var2.method5732(10);
                } else {
                    class343 var3 = this.field2365.method6016();
                    class90 var4 = new class90();
                    var4.method2218(this.field2365);
                    var4.method2219(var3.field3611);
                    client.method55().method6526(var4);
                    this.method3902();
                }
                return true;
            case 85:
                if (this.field2361) {
                    var2.method5878();
                } else {
                    var2.method5721();
                }
                return true;
            case 96:
                if (this.field2361) {
                    var2.method5734(this.field2363);
                } else {
                    var2.method5852(this.field2363);
                }
                return true;
            case 97:
                if (this.field2361) {
                    var2.method5735(this.field2363);
                } else {
                    var2.method5733(this.field2363);
                }
                return true;
            case 98:
                if (this.field2361) {
                    var2.method5810();
                } else {
                    var2.method5736(this.field2363);
                }
                return true;
            case 99:
                if (this.field2361) {
                    var2.method5719();
                } else {
                    var2.method5737(this.field2363);
                }
                return true;
            case 101:
                if (this.field2361) {
                    var2.method5962();
                } else {
                    var2.method5894();
                }
                return true;
            case 102:
                if (this.field2361) {
                    var2.method5730(this.field2363);
                } else {
                    var2.method5880(this.field2363);
                }
                return true;
            case 103:
                if (this.field2361) {
                    var2.method5731(this.field2363);
                } else {
                    var2.method5729(this.field2363);
                }
                return true;
            case 104:
                if (this.field2361) {
                    var2.method5740(this.field2363);
                } else {
                    var2.method5738(this.field2363);
                }
                return true;
            case 105:
                if (this.field2361) {
                    var2.method5741(this.field2363);
                } else {
                    var2.method5739(this.field2363);
                }
                return true;
            default:
                return false;
        }
    }
}
