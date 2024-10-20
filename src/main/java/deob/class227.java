package deob;

import java.awt.datatransfer.Clipboard;

@ObfuscatedName("ir")
public class class227 implements class30 {

    @ObfuscatedName("ir.aq")
    public class350 field2415 = null;

    @ObfuscatedName("ir.aw")
    public boolean field2413 = false;

    @ObfuscatedName("ir.al")
    public boolean field2412 = false;

    @ObfuscatedName("ir.ag(Lng;B)V")
    public void method4026(class350 arg0) {
        if (arg0 == null) {
            this.method4022();
            return;
        }
        if (this.field2415 != arg0) {
            this.method4022();
            this.field2415 = arg0;
        }
        class346 var2 = arg0.method6187();
        if (var2 == null) {
            return;
        }
        if (!var2.field3657.method5903() && var2.field3660 != null) {
            class89 var3 = new class89();
            var3.method2253(arg0);
            var3.method2252(var2.field3660);
            client.method6301().method6678(var3);
        }
        var2.field3657.method6068(true);
    }

    @ObfuscatedName("ir.am(B)Lng;")
    public class350 method4021() {
        return this.field2415;
    }

    @ObfuscatedName("ir.ad(B)V")
    public void method4022() {
        if (this.field2415 == null) {
            return;
        }
        class346 var1 = this.field2415.method6187();
        class350 var2 = this.field2415;
        this.field2415 = null;
        if (var1 == null) {
            return;
        }
        if (var1.field3657.method5903() && var1.field3660 != null) {
            class89 var3 = new class89();
            var3.method2253(var2);
            var3.method2252(var1.field3660);
            client.method6301().method6678(var3);
        }
        var1.field3657.method6068(false);
    }

    @ObfuscatedName("ir.aq(II)Z")
    public boolean method403(int arg0) {
        if (this.field2415 == null) {
            return false;
        }
        class28 var2 = this.field2415.method6171();
        if (var2 == null) {
            return false;
        }
        if (var2.method382(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2412 = true;
                    break;
                case 82:
                    this.field2413 = true;
                    break;
                default:
                    if (this.method4024(arg0)) {
                        client.method2816(this.field2415);
                    }
            }
        }
        return var2.method358(arg0);
    }

    @ObfuscatedName("ir.aw(II)Z")
    public boolean method396(int arg0) {
        switch(arg0) {
            case 81:
                this.field2412 = false;
                return false;
            case 82:
                this.field2413 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("ir.al(CB)Z")
    public boolean method402(char arg0) {
        if (this.field2415 == null) {
            return false;
        } else if (class404.method5811(arg0)) {
            class348 var2 = this.field2415.method6152();
            if (var2 == null || !var2.method5908()) {
                return false;
            }
            class28 var3 = this.field2415.method6171();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method375(arg0) && var2.method5870(arg0)) {
                    client.method2816(this.field2415);
                }
                return var3.method353(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("ir.ai(ZI)Z")
    public boolean method401(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ir.at(IB)Z")
    public boolean method4024(int arg0) {
        if (this.field2415 == null) {
            return false;
        }
        class348 var2 = this.field2415.method6152();
        if (var2 == null || !var2.method5908()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method4022();
                return true;
            case 48:
                if (this.field2413) {
                    var2.method5860();
                }
                return true;
            case 65:
                if (this.field2413) {
                    Clipboard var10 = Statics.field2033.method455();
                    var2.method6093(var10);
                }
                return true;
            case 66:
                if (this.field2413) {
                    Clipboard var8 = Statics.field2033.method455();
                    var2.method5893(var8);
                }
                return true;
            case 67:
                if (this.field2413) {
                    Clipboard var6 = Statics.field2033.method455();
                    var2.method5945(var6);
                }
                return true;
            case 84:
                if (var2.method5914() == 0) {
                    var2.method5870(10);
                } else if (this.field2412 && var2.method5918()) {
                    var2.method5870(10);
                } else {
                    class346 var3 = this.field2415.method6187();
                    class89 var4 = new class89();
                    var4.method2253(this.field2415);
                    var4.method2252(var3.field3661);
                    client.method6301().method6678(var4);
                    this.method4022();
                }
                return true;
            case 85:
                if (this.field2413) {
                    var2.method6129();
                } else {
                    var2.method5871();
                }
                return true;
            case 96:
                if (this.field2413) {
                    var2.method5883(this.field2412);
                } else {
                    var2.method5881(this.field2412);
                }
                return true;
            case 97:
                if (this.field2413) {
                    var2.method5884(this.field2412);
                } else {
                    var2.method6083(this.field2412);
                }
                return true;
            case 98:
                if (this.field2413) {
                    var2.method5896();
                } else {
                    var2.method5885(this.field2412);
                }
                return true;
            case 99:
                if (this.field2413) {
                    var2.method5999();
                } else {
                    var2.method6056(this.field2412);
                }
                return true;
            case 101:
                if (this.field2413) {
                    var2.method5874();
                } else {
                    var2.method5872();
                }
                return true;
            case 102:
                if (this.field2413) {
                    var2.method5879(this.field2412);
                } else {
                    var2.method5877(this.field2412);
                }
                return true;
            case 103:
                if (this.field2413) {
                    var2.method6112(this.field2412);
                } else {
                    var2.method5878(this.field2412);
                }
                return true;
            case 104:
                if (this.field2413) {
                    var2.method5889(this.field2412);
                } else {
                    var2.method5851(this.field2412);
                }
                return true;
            case 105:
                if (this.field2413) {
                    var2.method5890(this.field2412);
                } else {
                    var2.method5888(this.field2412);
                }
                return true;
            default:
                return false;
        }
    }
}
