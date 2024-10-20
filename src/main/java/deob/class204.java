package deob;

@ObfuscatedName("gm")
public class class204 implements class30 {

    @ObfuscatedName("gm.f")
    public class310 field2315 = null;

    @ObfuscatedName("gm.w")
    public boolean field2312 = false;

    @ObfuscatedName("gm.v")
    public boolean field2313 = false;

    @ObfuscatedName("gm.x(Lkz;B)V")
    public void method3794(class310 arg0) {
        this.method3795();
        if (arg0 == null) {
            return;
        }
        this.field2315 = arg0;
        class306 var2 = arg0.method5698();
        if (var2 == null) {
            return;
        }
        var2.field3477.method5527(true);
        if (var2.field3481 != null) {
            class84 var3 = new class84();
            var3.method2211(arg0);
            var3.method2208(var2.field3481);
            client.method164().method6236(var3);
        }
    }

    @ObfuscatedName("gm.a(S)Lkz;")
    public class310 method3797() {
        return this.field2315;
    }

    @ObfuscatedName("gm.q(I)V")
    public void method3795() {
        if (this.field2315 == null) {
            return;
        }
        class306 var1 = this.field2315.method5698();
        class310 var2 = this.field2315;
        this.field2315 = null;
        if (var1 == null) {
            return;
        }
        var1.field3477.method5527(false);
        if (var1.field3481 != null) {
            class84 var3 = new class84();
            var3.method2211(var2);
            var3.method2208(var1.field3481);
            client.method164().method6236(var3);
        }
    }

    @ObfuscatedName("gm.f(IB)Z")
    public boolean method430(int arg0) {
        if (this.field2315 == null) {
            return false;
        }
        class28 var2 = this.field2315.method5697();
        if (var2 == null) {
            return false;
        }
        if (var2.method404(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2313 = true;
                    break;
                case 82:
                    this.field2312 = true;
                    break;
                default:
                    if (this.method3796(arg0)) {
                        client.method2361(this.field2315);
                    }
            }
        }
        return var2.method409(arg0);
    }

    @ObfuscatedName("gm.w(IB)Z")
    public boolean method429(int arg0) {
        switch(arg0) {
            case 81:
                this.field2313 = false;
                return false;
            case 82:
                this.field2312 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("gm.v(CI)Z")
    public boolean method437(char arg0) {
        if (this.field2315 == null) {
            return false;
        } else if (class363.method5278(arg0)) {
            class308 var2 = this.field2315.method5705();
            if (var2 == null || !var2.method5449()) {
                return false;
            }
            class28 var3 = this.field2315.method5697();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method391(arg0) && var2.method5410(arg0)) {
                    client.method2361(this.field2315);
                }
                return var3.method389(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("gm.s(ZI)Z")
    public boolean method431(boolean arg0) {
        return false;
    }

    @ObfuscatedName("gm.d(II)Z")
    public boolean method3796(int arg0) {
        if (this.field2315 == null) {
            return false;
        }
        class308 var2 = this.field2315.method5705();
        if (var2 == null || !var2.method5449()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3795();
                return true;
            case 48:
                if (this.field2312) {
                    var2.method5461();
                }
                return true;
            case 65:
                if (this.field2312) {
                    var2.method5435(client.method163());
                }
                return true;
            case 66:
                if (this.field2312) {
                    var2.method5434(client.method163());
                }
                return true;
            case 67:
                if (this.field2312) {
                    var2.method5513(client.method163());
                }
                return true;
            case 84:
                if (var2.method5418() == 0) {
                    var2.method5410(10);
                } else if (this.field2313 && var2.method5458()) {
                    var2.method5410(10);
                } else {
                    class306 var3 = this.field2315.method5698();
                    class84 var4 = new class84();
                    var4.method2211(this.field2315);
                    var4.method2208(var3.field3483);
                    client.method164().method6236(var4);
                    this.method3795();
                }
                return true;
            case 85:
                if (this.field2312) {
                    var2.method5413();
                } else {
                    var2.method5411();
                }
                return true;
            case 96:
                if (this.field2312) {
                    var2.method5633(this.field2313);
                } else {
                    var2.method5507(this.field2313);
                }
                return true;
            case 97:
                if (this.field2312) {
                    var2.method5425(this.field2313);
                } else {
                    var2.method5423(this.field2313);
                }
                return true;
            case 98:
                if (this.field2312) {
                    var2.method5437();
                } else {
                    var2.method5426(this.field2313);
                }
                return true;
            case 99:
                if (this.field2312) {
                    var2.method5438();
                } else {
                    var2.method5427(this.field2313);
                }
                return true;
            case 101:
                if (this.field2312) {
                    var2.method5414();
                } else {
                    var2.method5594();
                }
                return true;
            case 102:
                if (this.field2312) {
                    var2.method5602(this.field2313);
                } else {
                    var2.method5393(this.field2313);
                }
                return true;
            case 103:
                if (this.field2312) {
                    var2.method5630(this.field2313);
                } else {
                    var2.method5530(this.field2313);
                }
                return true;
            case 104:
                if (this.field2312) {
                    var2.method5430(this.field2313);
                } else {
                    var2.method5428(this.field2313);
                }
                return true;
            case 105:
                if (this.field2312) {
                    var2.method5431(this.field2313);
                } else {
                    var2.method5429(this.field2313);
                }
                return true;
            default:
                return false;
        }
    }
}
