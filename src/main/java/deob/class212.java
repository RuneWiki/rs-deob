package deob;

@ObfuscatedName("iw")
public class class212 implements class30 {

    @ObfuscatedName("iw.aw")
    public class333 field2306 = null;

    @ObfuscatedName("iw.ay")
    public boolean field2304 = false;

    @ObfuscatedName("iw.ar")
    public boolean field2309 = false;

    @ObfuscatedName("iw.ax(Lmt;B)V")
    public void method3786(class333 arg0) {
        this.method3783();
        if (arg0 == null) {
            return;
        }
        this.field2306 = arg0;
        class329 var2 = arg0.method5869();
        if (var2 == null) {
            return;
        }
        var2.field3553.method5558(true);
        if (var2.field3558 != null) {
            class88 var3 = new class88();
            var3.method2195(arg0);
            var3.method2184(var2.field3558);
            client.method5163().method6367(var3);
        }
    }

    @ObfuscatedName("iw.aa(B)Lmt;")
    public class333 method3782() {
        return this.field2306;
    }

    @ObfuscatedName("iw.au(I)V")
    public void method3783() {
        if (this.field2306 == null) {
            return;
        }
        class329 var1 = this.field2306.method5869();
        class333 var2 = this.field2306;
        this.field2306 = null;
        if (var1 == null) {
            return;
        }
        var1.field3553.method5558(false);
        if (var1.field3558 != null) {
            class88 var3 = new class88();
            var3.method2195(var2);
            var3.method2184(var1.field3558);
            client.method5163().method6367(var3);
        }
    }

    @ObfuscatedName("iw.aw(II)Z")
    public boolean method436(int arg0) {
        if (this.field2306 == null) {
            return false;
        }
        class28 var2 = this.field2306.method5861();
        if (var2 == null) {
            return false;
        }
        if (var2.method389(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2309 = true;
                    break;
                case 82:
                    this.field2304 = true;
                    break;
                default:
                    if (this.method3785(arg0)) {
                        client.method3478(this.field2306);
                    }
            }
        }
        return var2.method386(arg0);
    }

    @ObfuscatedName("iw.ay(II)Z")
    public boolean method427(int arg0) {
        switch(arg0) {
            case 81:
                this.field2309 = false;
                return false;
            case 82:
                this.field2304 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("iw.ar(CI)Z")
    public boolean method428(char arg0) {
        if (this.field2306 == null) {
            return false;
        }
        boolean var2;
        if (arg0 >= ' ' && arg0 < 127 || arg0 > 127 && arg0 < 160 || arg0 > 160 && arg0 <= 255) {
            var2 = true;
        } else {
            label81: {
                if (arg0 != 0) {
                    char[] var3 = class386.field4430;
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
        class331 var6 = this.field2306.method5902();
        if (var6 == null || !var6.method5614()) {
            return false;
        }
        class28 var7 = this.field2306.method5861();
        if (var7 == null) {
            return false;
        } else {
            if (var7.method397(arg0) && var6.method5820(arg0)) {
                client.method3478(this.field2306);
            }
            return var7.method387(arg0);
        }
    }

    @ObfuscatedName("iw.am(ZB)Z")
    public boolean method429(boolean arg0) {
        return false;
    }

    @ObfuscatedName("iw.ae(IS)Z")
    public boolean method3785(int arg0) {
        if (this.field2306 == null) {
            return false;
        }
        class331 var2 = this.field2306.method5902();
        if (var2 == null || !var2.method5614()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3783();
                return true;
            case 48:
                if (this.field2304) {
                    var2.method5632();
                }
                return true;
            case 65:
                if (this.field2304) {
                    var2.method5600(client.method2970());
                }
                return true;
            case 66:
                if (this.field2304) {
                    var2.method5599(client.method2970());
                }
                return true;
            case 67:
                if (this.field2304) {
                    var2.method5601(client.method2970());
                }
                return true;
            case 84:
                if (var2.method5602() == 0) {
                    var2.method5820(10);
                } else if (this.field2309 && var2.method5624()) {
                    var2.method5820(10);
                } else {
                    class329 var3 = this.field2306.method5869();
                    class88 var4 = new class88();
                    var4.method2195(this.field2306);
                    var4.method2184(var3.field3555);
                    client.method5163().method6367(var4);
                    this.method3783();
                }
                return true;
            case 85:
                if (this.field2304) {
                    var2.method5578();
                } else {
                    var2.method5633();
                }
                return true;
            case 96:
                if (this.field2304) {
                    var2.method5589(this.field2309);
                } else {
                    var2.method5587(this.field2309);
                }
                return true;
            case 97:
                if (this.field2304) {
                    var2.method5590(this.field2309);
                } else {
                    var2.method5588(this.field2309);
                }
                return true;
            case 98:
                if (this.field2304) {
                    var2.method5628();
                } else {
                    var2.method5756(this.field2309);
                }
                return true;
            case 99:
                if (this.field2304) {
                    var2.method5583();
                } else {
                    var2.method5592(this.field2309);
                }
                return true;
            case 101:
                if (this.field2304) {
                    var2.method5579();
                } else {
                    var2.method5577();
                }
                return true;
            case 102:
                if (this.field2304) {
                    var2.method5585(this.field2309);
                } else {
                    var2.method5719(this.field2309);
                }
                return true;
            case 103:
                if (this.field2304) {
                    var2.method5715(this.field2309);
                } else {
                    var2.method5584(this.field2309);
                }
                return true;
            case 104:
                if (this.field2304) {
                    var2.method5751(this.field2309);
                } else {
                    var2.method5593(this.field2309);
                }
                return true;
            case 105:
                if (this.field2304) {
                    var2.method5596(this.field2309);
                } else {
                    var2.method5556(this.field2309);
                }
                return true;
            default:
                return false;
        }
    }
}
