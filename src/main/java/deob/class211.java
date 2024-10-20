package deob;

@ObfuscatedName("ig")
public class class211 implements class30 {

    @ObfuscatedName("ig.au")
    public class332 field2347 = null;

    @ObfuscatedName("ig.ae")
    public boolean field2346 = false;

    @ObfuscatedName("ig.ao")
    public boolean field2348 = false;

    @ObfuscatedName("ig.ar(Lmi;I)V")
    public void method3793(class332 arg0) {
        this.method3792();
        if (arg0 == null) {
            return;
        }
        this.field2347 = arg0;
        class328 var2 = arg0.method5874();
        if (var2 == null) {
            return;
        }
        var2.field3564.method5562(true);
        if (var2.field3565 != null) {
            class88 var3 = new class88();
            var3.method2192(arg0);
            var3.method2193(var2.field3565);
            client.method440().method6405(var3);
        }
    }

    @ObfuscatedName("ig.ab(I)Lmi;")
    public class332 method3787() {
        return this.field2347;
    }

    @ObfuscatedName("ig.ag(B)V")
    public void method3792() {
        if (this.field2347 == null) {
            return;
        }
        class328 var1 = this.field2347.method5874();
        class332 var2 = this.field2347;
        this.field2347 = null;
        if (var1 == null) {
            return;
        }
        var1.field3564.method5562(false);
        if (var1.field3565 != null) {
            class88 var3 = new class88();
            var3.method2192(var2);
            var3.method2193(var1.field3565);
            client.method440().method6405(var3);
        }
    }

    @ObfuscatedName("ig.au(II)Z")
    public boolean method430(int arg0) {
        if (this.field2347 == null) {
            return false;
        }
        class28 var2 = this.field2347.method5857();
        if (var2 == null) {
            return false;
        }
        if (var2.method414(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2348 = true;
                    break;
                case 82:
                    this.field2346 = true;
                    break;
                default:
                    if (this.method3790(arg0)) {
                        client.method3930(this.field2347);
                    }
            }
        }
        return var2.method379(arg0);
    }

    @ObfuscatedName("ig.ae(II)Z")
    public boolean method427(int arg0) {
        switch(arg0) {
            case 81:
                this.field2348 = false;
                return false;
            case 82:
                this.field2346 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("ig.ao(CI)Z")
    public boolean method428(char arg0) {
        if (this.field2347 == null) {
            return false;
        }
        boolean var2;
        if (arg0 >= ' ' && arg0 < 127 || arg0 > 127 && arg0 < 160 || arg0 > 160 && arg0 <= 255) {
            var2 = true;
        } else {
            label81: {
                if (arg0 != 0) {
                    char[] var3 = class385.field4425;
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
        class330 var6 = this.field2347.method5988();
        if (var6 == null || !var6.method5618()) {
            return false;
        }
        class28 var7 = this.field2347.method5857();
        if (var7 == null) {
            return false;
        } else {
            if (var7.method382(arg0) && var6.method5655(arg0)) {
                client.method3930(this.field2347);
            }
            return var7.method385(arg0);
        }
    }

    @ObfuscatedName("ig.at(ZI)Z")
    public boolean method435(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ig.am(IB)Z")
    public boolean method3790(int arg0) {
        if (this.field2347 == null) {
            return false;
        }
        class330 var2 = this.field2347.method5988();
        if (var2 == null || !var2.method5618()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3792();
                return true;
            case 48:
                if (this.field2346) {
                    var2.method5826();
                }
                return true;
            case 65:
                if (this.field2346) {
                    var2.method5564(client.method6257());
                }
                return true;
            case 66:
                if (this.field2346) {
                    var2.method5603(client.method6257());
                }
                return true;
            case 67:
                if (this.field2346) {
                    var2.method5605(client.method6257());
                }
                return true;
            case 84:
                if (var2.method5624() == 0) {
                    var2.method5655(10);
                } else if (this.field2348 && var2.method5699()) {
                    var2.method5655(10);
                } else {
                    class328 var3 = this.field2347.method5874();
                    class88 var4 = new class88();
                    var4.method2192(this.field2347);
                    var4.method2193(var3.field3561);
                    client.method440().method6405(var4);
                    this.method3792();
                }
                return true;
            case 85:
                if (this.field2346) {
                    var2.method5582();
                } else {
                    var2.method5580();
                }
                return true;
            case 96:
                if (this.field2346) {
                    var2.method5593(this.field2348);
                } else {
                    var2.method5760(this.field2348);
                }
                return true;
            case 97:
                if (this.field2346) {
                    var2.method5594(this.field2348);
                } else {
                    var2.method5592(this.field2348);
                }
                return true;
            case 98:
                if (this.field2346) {
                    var2.method5764();
                } else {
                    var2.method5595(this.field2348);
                }
                return true;
            case 99:
                if (this.field2346) {
                    var2.method5607();
                } else {
                    var2.method5596(this.field2348);
                }
                return true;
            case 101:
                if (this.field2346) {
                    var2.method5612();
                } else {
                    var2.method5581();
                }
                return true;
            case 102:
                if (this.field2346) {
                    var2.method5589(this.field2348);
                } else {
                    var2.method5587(this.field2348);
                }
                return true;
            case 103:
                if (this.field2346) {
                    var2.method5590(this.field2348);
                } else {
                    var2.method5588(this.field2348);
                }
                return true;
            case 104:
                if (this.field2346) {
                    var2.method5736(this.field2348);
                } else {
                    var2.method5597(this.field2348);
                }
                return true;
            case 105:
                if (this.field2346) {
                    var2.method5734(this.field2348);
                } else {
                    var2.method5583(this.field2348);
                }
                return true;
            default:
                return false;
        }
    }
}
