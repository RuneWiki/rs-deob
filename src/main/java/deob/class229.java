package deob;

@ObfuscatedName("ih")
public class class229 implements class30 {

    @ObfuscatedName("ih.ak")
    public class358 field2456 = null;

    @ObfuscatedName("ih.al")
    public boolean field2453 = false;

    @ObfuscatedName("ih.aj")
    public boolean field2452 = false;

    @ObfuscatedName("ih.as(Lnb;I)V")
    public void method4068(class358 arg0) {
        if (arg0 == null) {
            this.method4070();
            return;
        }
        if (this.field2456 != arg0) {
            this.method4070();
            this.field2456 = arg0;
        }
        class354 var2 = arg0.method6315();
        if (var2 == null) {
            return;
        }
        if (!var2.field3752.method6163() && var2.field3754 != null) {
            class90 var3 = new class90();
            var3.method2233(arg0);
            var3.method2228(var2.field3754);
            client.method857().method6829(var3);
        }
        var2.field3752.method5987(true);
    }

    @ObfuscatedName("ih.aw(B)Lnb;")
    public class358 method4069() {
        return this.field2456;
    }

    @ObfuscatedName("ih.ad(I)V")
    public void method4070() {
        if (this.field2456 == null) {
            return;
        }
        class354 var1 = this.field2456.method6315();
        class358 var2 = this.field2456;
        this.field2456 = null;
        if (var1 == null) {
            return;
        }
        if (var1.field3752.method6163() && var1.field3754 != null) {
            class90 var3 = new class90();
            var3.method2233(var2);
            var3.method2228(var1.field3754);
            client.method857().method6829(var3);
        }
        var1.field3752.method5987(false);
    }

    @ObfuscatedName("ih.ak(II)Z")
    public boolean method434(int arg0) {
        if (this.field2456 == null) {
            return false;
        }
        class28 var2 = this.field2456.method6411();
        if (var2 == null) {
            return false;
        }
        if (var2.method383(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2452 = true;
                    break;
                case 82:
                    this.field2453 = true;
                    break;
                default:
                    if (this.method4071(arg0)) {
                        Statics.method5599(this.field2456);
                    }
            }
        }
        return var2.method381(arg0);
    }

    @ObfuscatedName("ih.al(II)Z")
    public boolean method436(int arg0) {
        switch(arg0) {
            case 81:
                this.field2452 = false;
                return false;
            case 82:
                this.field2453 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("ih.aj(CI)Z")
    public boolean method423(char arg0) {
        if (this.field2456 == null) {
            return false;
        } else if (class413.method8689(arg0)) {
            class356 var2 = this.field2456.method6312();
            if (var2 == null || !var2.method6043()) {
                return false;
            }
            class28 var3 = this.field2456.method6411();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method384(arg0) && var2.method6004(arg0)) {
                    Statics.method5599(this.field2456);
                }
                return var3.method379(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("ih.az(ZS)Z")
    public boolean method437(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ih.ai(IB)Z")
    public boolean method4071(int arg0) {
        if (this.field2456 == null) {
            return false;
        }
        class356 var2 = this.field2456.method6312();
        if (var2 == null || !var2.method6043()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method4070();
                return true;
            case 48:
                if (this.field2453) {
                    var2.method6166();
                }
                return true;
            case 65:
                if (this.field2453) {
                    var2.method6054(client.method3476());
                }
                return true;
            case 66:
                if (this.field2453) {
                    var2.method6028(client.method3476());
                }
                return true;
            case 67:
                if (this.field2453) {
                    var2.method6030(client.method3476());
                }
                return true;
            case 84:
                if (var2.method6049() == 0) {
                    var2.method6004(10);
                } else if (this.field2452 && var2.method6053()) {
                    var2.method6004(10);
                } else {
                    class354 var3 = this.field2456.method6315();
                    class90 var4 = new class90();
                    var4.method2233(this.field2456);
                    var4.method2228(var3.field3753);
                    client.method857().method6829(var4);
                    this.method4070();
                }
                return true;
            case 85:
                if (this.field2453) {
                    var2.method6144();
                } else {
                    var2.method6005();
                }
                return true;
            case 96:
                if (this.field2453) {
                    var2.method6018(this.field2452);
                } else {
                    var2.method6016(this.field2452);
                }
                return true;
            case 97:
                if (this.field2453) {
                    var2.method6019(this.field2452);
                } else {
                    var2.method5994(this.field2452);
                }
                return true;
            case 98:
                if (this.field2453) {
                    var2.method6031();
                } else {
                    var2.method6180(this.field2452);
                }
                return true;
            case 99:
                if (this.field2453) {
                    var2.method6032();
                } else {
                    var2.method6021(this.field2452);
                }
                return true;
            case 101:
                if (this.field2453) {
                    var2.method6068();
                } else {
                    var2.method6006();
                }
                return true;
            case 102:
                if (this.field2453) {
                    var2.method6014(this.field2452);
                } else {
                    var2.method6074(this.field2452);
                }
                return true;
            case 103:
                if (this.field2453) {
                    var2.method6015(this.field2452);
                } else {
                    var2.method6052(this.field2452);
                }
                return true;
            case 104:
                if (this.field2453) {
                    var2.method6201(this.field2452);
                } else {
                    var2.method6022(this.field2452);
                }
                return true;
            case 105:
                if (this.field2453) {
                    var2.method6025(this.field2452);
                } else {
                    var2.method6023(this.field2452);
                }
                return true;
            default:
                return false;
        }
    }
}
