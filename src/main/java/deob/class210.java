package deob;

@ObfuscatedName("ih")
public class class210 implements class30 {

    @ObfuscatedName("ih.at")
    public class330 field2326 = null;

    @ObfuscatedName("ih.an")
    public boolean field2324 = false;

    @ObfuscatedName("ih.av")
    public boolean field2325 = false;

    @ObfuscatedName("ih.aa(Lmb;B)V")
    public void method3783(class330 arg0) {
        this.method3774();
        if (arg0 == null) {
            return;
        }
        this.field2326 = arg0;
        class326 var2 = arg0.method5806();
        if (var2 == null) {
            return;
        }
        var2.field3530.method5479(true);
        if (var2.field3533 != null) {
            class88 var3 = new class88();
            var3.method2150(arg0);
            var3.method2149(var2.field3533);
            client.method1109().method6303(var3);
        }
    }

    @ObfuscatedName("ih.aj(I)Lmb;")
    public class330 method3772() {
        return this.field2326;
    }

    @ObfuscatedName("ih.ad(B)V")
    public void method3774() {
        if (this.field2326 == null) {
            return;
        }
        class326 var1 = this.field2326.method5806();
        class330 var2 = this.field2326;
        this.field2326 = null;
        if (var1 == null) {
            return;
        }
        var1.field3530.method5479(false);
        if (var1.field3533 != null) {
            class88 var3 = new class88();
            var3.method2150(var2);
            var3.method2149(var1.field3533);
            client.method1109().method6303(var3);
        }
    }

    @ObfuscatedName("ih.at(II)Z")
    public boolean method417(int arg0) {
        if (this.field2326 == null) {
            return false;
        }
        class28 var2 = this.field2326.method5805();
        if (var2 == null) {
            return false;
        }
        if (var2.method381(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2325 = true;
                    break;
                case 82:
                    this.field2324 = true;
                    break;
                default:
                    if (this.method3785(arg0)) {
                        client.method2632(this.field2326);
                    }
            }
        }
        return var2.method379(arg0);
    }

    @ObfuscatedName("ih.an(IB)Z")
    public boolean method416(int arg0) {
        switch(arg0) {
            case 81:
                this.field2325 = false;
                return false;
            case 82:
                this.field2324 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("ih.av(CB)Z")
    public boolean method418(char arg0) {
        if (this.field2326 == null) {
            return false;
        }
        boolean var2;
        if (arg0 >= ' ' && arg0 < 127 || arg0 > 127 && arg0 < 160 || arg0 > 160 && arg0 <= 255) {
            var2 = true;
        } else {
            label81: {
                if (arg0 != 0) {
                    char[] var3 = class383.field4391;
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
        class328 var6 = this.field2326.method5803();
        if (var6 == null || !var6.method5661()) {
            return false;
        }
        class28 var7 = this.field2326.method5805();
        if (var7 == null) {
            return false;
        } else {
            if (var7.method382(arg0) && var6.method5677(arg0)) {
                client.method2632(this.field2326);
            }
            return var7.method380(arg0);
        }
    }

    @ObfuscatedName("ih.as(ZI)Z")
    public boolean method423(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ih.ac(IS)Z")
    public boolean method3785(int arg0) {
        if (this.field2326 == null) {
            return false;
        }
        class328 var2 = this.field2326.method5803();
        if (var2 == null || !var2.method5661()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3774();
                return true;
            case 48:
                if (this.field2324) {
                    var2.method5502();
                }
                return true;
            case 65:
                if (this.field2324) {
                    var2.method5521(client.method368());
                }
                return true;
            case 66:
                if (this.field2324) {
                    var2.method5520(client.method368());
                }
                return true;
            case 67:
                if (this.field2324) {
                    var2.method5607(client.method368());
                }
                return true;
            case 84:
                if (var2.method5541() == 0) {
                    var2.method5677(10);
                } else if (this.field2325 && var2.method5545()) {
                    var2.method5677(10);
                } else {
                    class326 var3 = this.field2326.method5806();
                    class88 var4 = new class88();
                    var4.method2150(this.field2326);
                    var4.method2149(var3.field3535);
                    client.method1109().method6303(var4);
                    this.method3774();
                }
                return true;
            case 85:
                if (this.field2324) {
                    var2.method5499();
                } else {
                    var2.method5696();
                }
                return true;
            case 96:
                if (this.field2324) {
                    var2.method5510(this.field2325);
                } else {
                    var2.method5689(this.field2325);
                }
                return true;
            case 97:
                if (this.field2324) {
                    var2.method5518(this.field2325);
                } else {
                    var2.method5717(this.field2325);
                }
                return true;
            case 98:
                if (this.field2324) {
                    var2.method5523();
                } else {
                    var2.method5512(this.field2325);
                }
                return true;
            case 99:
                if (this.field2324) {
                    var2.method5687();
                } else {
                    var2.method5669(this.field2325);
                }
                return true;
            case 101:
                if (this.field2324) {
                    var2.method5671();
                } else {
                    var2.method5498();
                }
                return true;
            case 102:
                if (this.field2324) {
                    var2.method5506(this.field2325);
                } else {
                    var2.method5754(this.field2325);
                }
                return true;
            case 103:
                if (this.field2324) {
                    var2.method5507(this.field2325);
                } else {
                    var2.method5639(this.field2325);
                }
                return true;
            case 104:
                if (this.field2324) {
                    var2.method5516(this.field2325);
                } else {
                    var2.method5514(this.field2325);
                }
                return true;
            case 105:
                if (this.field2324) {
                    var2.method5664(this.field2325);
                } else {
                    var2.method5515(this.field2325);
                }
                return true;
            default:
                return false;
        }
    }
}
