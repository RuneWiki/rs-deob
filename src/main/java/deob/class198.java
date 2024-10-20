package deob;

@ObfuscatedName("gh")
public class class198 implements class31 {

    @ObfuscatedName("gh.a")
    public class303 field2234 = null;

    @ObfuscatedName("gh.f")
    public boolean field2235 = false;

    @ObfuscatedName("gh.c")
    public boolean field2236 = false;

    @ObfuscatedName("gh.u(Lkn;I)V")
    public void method3605(class303 arg0) {
        this.method3611();
        if (arg0 == null) {
            return;
        }
        this.field2234 = arg0;
        class299 var2 = arg0.method5532();
        if (var2 == null) {
            return;
        }
        var2.field3420.method5220(true);
        if (var2.field3414 != null) {
            class85 var3 = new class85();
            var3.method2144(arg0);
            var3.method2147(var2.field3414);
            client.method7152().method6031(var3);
        }
    }

    @ObfuscatedName("gh.z(I)Lkn;")
    public class303 method3606() {
        return this.field2234;
    }

    @ObfuscatedName("gh.t(B)V")
    public void method3611() {
        if (this.field2234 == null) {
            return;
        }
        class299 var1 = this.field2234.method5532();
        class303 var2 = this.field2234;
        this.field2234 = null;
        if (var1 == null) {
            return;
        }
        var1.field3420.method5220(false);
        if (var1.field3414 != null) {
            class85 var3 = new class85();
            var3.method2144(var2);
            var3.method2147(var1.field3414);
            client.method7152().method6031(var3);
        }
    }

    @ObfuscatedName("gh.a(II)Z")
    public boolean method454(int arg0) {
        if (this.field2234 == null) {
            return false;
        }
        class29 var2 = this.field2234.method5531();
        if (var2 == null) {
            return false;
        }
        if (var2.method424(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2236 = true;
                    break;
                case 82:
                    this.field2235 = true;
                    break;
                default:
                    if (this.method3607(arg0)) {
                        client.method2867(this.field2234);
                    }
            }
        }
        return var2.method405(arg0);
    }

    @ObfuscatedName("gh.f(II)Z")
    public boolean method444(int arg0) {
        switch(arg0) {
            case 81:
                this.field2236 = false;
                return false;
            case 82:
                this.field2235 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("gh.c(CI)Z")
    public boolean method445(char arg0) {
        if (this.field2234 == null) {
            return false;
        } else if (class356.method4926(arg0)) {
            class301 var2 = this.field2234.method5529();
            if (var2 == null || !var2.method5359()) {
                return false;
            }
            class29 var3 = this.field2234.method5531();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method421(arg0) && var2.method5237(arg0)) {
                    client.method2867(this.field2234);
                }
                return var3.method406(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("gh.x(ZB)Z")
    public boolean method446(boolean arg0) {
        return false;
    }

    @ObfuscatedName("gh.w(II)Z")
    public boolean method3607(int arg0) {
        if (this.field2234 == null) {
            return false;
        }
        class301 var2 = this.field2234.method5529();
        if (var2 == null || !var2.method5359()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3611();
                return true;
            case 48:
                if (this.field2235) {
                    var2.method5223();
                }
                return true;
            case 65:
                if (this.field2235) {
                    var2.method5262(client.method671());
                }
                return true;
            case 66:
                if (this.field2235) {
                    var2.method5293(client.method671());
                }
                return true;
            case 67:
                if (this.field2235) {
                    var2.method5307(client.method671());
                }
                return true;
            case 84:
                if (var2.method5282() == 0) {
                    var2.method5237(10);
                } else if (this.field2236 && var2.method5286()) {
                    var2.method5237(10);
                } else {
                    class299 var3 = this.field2234.method5532();
                    class85 var4 = new class85();
                    var4.method2144(this.field2234);
                    var4.method2147(var3.field3417);
                    client.method7152().method6031(var4);
                    this.method3611();
                }
                return true;
            case 85:
                if (this.field2235) {
                    var2.method5240();
                } else {
                    var2.method5276();
                }
                return true;
            case 96:
                if (this.field2235) {
                    var2.method5251(this.field2236);
                } else {
                    var2.method5481(this.field2236);
                }
                return true;
            case 97:
                if (this.field2235) {
                    var2.method5252(this.field2236);
                } else {
                    var2.method5239(this.field2236);
                }
                return true;
            case 98:
                if (this.field2235) {
                    var2.method5370();
                } else {
                    var2.method5339(this.field2236);
                }
                return true;
            case 99:
                if (this.field2235) {
                    var2.method5257();
                } else {
                    var2.method5463(this.field2236);
                }
                return true;
            case 101:
                if (this.field2235) {
                    var2.method5406();
                } else {
                    var2.method5325();
                }
                return true;
            case 102:
                if (this.field2235) {
                    var2.method5320(this.field2236);
                } else {
                    var2.method5245(this.field2236);
                }
                return true;
            case 103:
                if (this.field2235) {
                    var2.method5278(this.field2236);
                } else {
                    var2.method5306(this.field2236);
                }
                return true;
            case 104:
                if (this.field2235) {
                    var2.method5390(this.field2236);
                } else {
                    var2.method5221(this.field2236);
                }
                return true;
            case 105:
                if (this.field2235) {
                    var2.method5258(this.field2236);
                } else {
                    var2.method5256(this.field2236);
                }
                return true;
            default:
                return false;
        }
    }
}
