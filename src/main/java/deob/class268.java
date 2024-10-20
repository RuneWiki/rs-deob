package deob;

@ObfuscatedName("ki")
public class class268 implements class30 {

    @ObfuscatedName("ki.ac")
    public class363 field2966 = null;

    @ObfuscatedName("ki.ae")
    public boolean field2963 = false;

    @ObfuscatedName("ki.ag")
    public boolean field2964 = false;

    @ObfuscatedName("ki.ah(Lny;I)V")
    public void method5057(class363 arg0) {
        if (arg0 == null) {
            this.method5060();
            return;
        }
        if (this.field2966 != arg0) {
            this.method5060();
            this.field2966 = arg0;
        }
        class359 var2 = arg0.method6561();
        if (var2 == null) {
            return;
        }
        if (!var2.field3786.method6294() && var2.field3788 != null) {
            class91 var3 = new class91();
            var3.method2401(arg0);
            var3.method2403(var2.field3788);
            client.method3649().method7051(var3);
        }
        var2.field3786.method6243(true);
    }

    @ObfuscatedName("ki.ap(B)Lny;")
    public class363 method5059() {
        return this.field2966;
    }

    @ObfuscatedName("ki.ab(I)V")
    public void method5060() {
        if (this.field2966 == null) {
            return;
        }
        class359 var1 = this.field2966.method6561();
        class363 var2 = this.field2966;
        this.field2966 = null;
        if (var1 == null) {
            return;
        }
        if (var1.field3786.method6294() && var1.field3788 != null) {
            class91 var3 = new class91();
            var3.method2401(var2);
            var3.method2403(var1.field3788);
            client.method3649().method7051(var3);
        }
        var1.field3786.method6243(false);
    }

    @ObfuscatedName("ki.ac(II)Z")
    public boolean method437(int arg0) {
        if (this.field2966 == null) {
            return false;
        }
        class28 var2 = this.field2966.method6560();
        if (var2 == null) {
            return false;
        }
        if (var2.method378(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2964 = true;
                    break;
                case 82:
                    this.field2963 = true;
                    break;
                default:
                    if (this.method5056(arg0)) {
                        client.method2361(this.field2966);
                    }
            }
        }
        return var2.method376(arg0);
    }

    @ObfuscatedName("ki.ae(II)Z")
    public boolean method427(int arg0) {
        switch(arg0) {
            case 81:
                this.field2964 = false;
                return false;
            case 82:
                this.field2963 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("ki.ag(CI)Z")
    public boolean method428(char arg0) {
        if (this.field2966 == null) {
            return false;
        } else if (class417.method2550(arg0)) {
            class361 var2 = this.field2966.method6558();
            if (var2 == null || !var2.method6299()) {
                return false;
            }
            class28 var3 = this.field2966.method6560();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method397(arg0) && var2.method6260(arg0)) {
                    client.method2361(this.field2966);
                }
                return var3.method379(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("ki.am(ZI)Z")
    public boolean method429(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ki.az(II)Z")
    public boolean method5056(int arg0) {
        if (this.field2966 == null) {
            return false;
        }
        class361 var2 = this.field2966.method6558();
        if (var2 == null || !var2.method6299()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method5060();
                return true;
            case 48:
                if (this.field2963) {
                    var2.method6358();
                }
                return true;
            case 65:
                if (this.field2963) {
                    var2.method6312(client.method2593());
                }
                return true;
            case 66:
                if (this.field2963) {
                    var2.method6284(client.method2593());
                }
                return true;
            case 67:
                if (this.field2963) {
                    var2.method6286(client.method2593());
                }
                return true;
            case 84:
                if (var2.method6305() == 0) {
                    var2.method6260(10);
                } else if (this.field2964 && var2.method6309()) {
                    var2.method6260(10);
                } else {
                    class359 var3 = this.field2966.method6561();
                    class91 var4 = new class91();
                    var4.method2401(this.field2966);
                    var4.method2403(var3.field3789);
                    client.method3649().method7051(var4);
                    this.method5060();
                }
                return true;
            case 85:
                if (this.field2963) {
                    var2.method6263();
                } else {
                    var2.method6261();
                }
                return true;
            case 96:
                if (this.field2963) {
                    var2.method6274(this.field2964);
                } else {
                    var2.method6272(this.field2964);
                }
                return true;
            case 97:
                if (this.field2963) {
                    var2.method6275(this.field2964);
                } else {
                    var2.method6460(this.field2964);
                }
                return true;
            case 98:
                if (this.field2963) {
                    var2.method6287();
                } else {
                    var2.method6465(this.field2964);
                }
                return true;
            case 99:
                if (this.field2963) {
                    var2.method6288();
                } else {
                    var2.method6323(this.field2964);
                }
                return true;
            case 101:
                if (this.field2963) {
                    var2.method6473();
                } else {
                    var2.method6371();
                }
                return true;
            case 102:
                if (this.field2963) {
                    var2.method6409(this.field2964);
                } else {
                    var2.method6268(this.field2964);
                }
                return true;
            case 103:
                if (this.field2963) {
                    var2.method6271(this.field2964);
                } else {
                    var2.method6269(this.field2964);
                }
                return true;
            case 104:
                if (this.field2963) {
                    var2.method6249(this.field2964);
                } else {
                    var2.method6278(this.field2964);
                }
                return true;
            case 105:
                if (this.field2963) {
                    var2.method6281(this.field2964);
                } else {
                    var2.method6279(this.field2964);
                }
                return true;
            default:
                return false;
        }
    }
}
