package deob;

@ObfuscatedName("pd")
public class class411 {

    @ObfuscatedName("pd.at")
    public class407 field4536;

    @ObfuscatedName("pd.ah")
    public int field4537 = 0;

    @ObfuscatedName("pd.ar")
    public int field4538 = 0;

    public class411(class407 arg0, int arg1, int arg2) {
        this.field4536 = arg0;
        this.field4537 = arg1;
        this.field4538 = arg2;
    }

    @ObfuscatedName("pd.at(I)Ljava/lang/String;")
    public String method7087() {
        if (this.method7089()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7100());
        for (int var2 = this.field4537; var2 < this.field4538; var2++) {
            class409 var3 = this.field4536.method6868(var2);
            var1.append(var3.field4510);
        }
        return var1.toString();
    }

    @ObfuscatedName("pd.ah(II)Z")
    public boolean method7086(int arg0) {
        return this.field4536.method6865() == 2 || this.field4536.method6865() == 1 && (!this.field4536.field4500 || this.field4538 - 1 != arg0);
    }

    @ObfuscatedName("pd.ar(B)Z")
    public boolean method7089() {
        return this.field4538 == this.field4537;
    }

    @ObfuscatedName("pd.ao(B)I")
    public int method7100() {
        return this.field4538 - this.field4537;
    }

    @ObfuscatedName("pd.ab(Lpn;I)Z")
    public boolean method7091(class409 arg0) {
        if (this.field4536.field4506 == 2) {
            return true;
        } else if (this.field4536.field4506 == 0) {
            return false;
        } else {
            return this.field4536.method6888() != arg0;
        }
    }

    @ObfuscatedName("pd.au(S)I")
    public int method7088() {
        if (this.method7089()) {
            return 0;
        }
        class409 var1 = this.field4536.method6868(this.field4538 - 1);
        if (var1.field4510 == '\n') {
            return 0;
        } else if (this.method7091(var1)) {
            return this.field4536.field4490.field4515[42];
        } else {
            int var2 = this.field4536.field4490.field4515[var1.field4510];
            if (var2 == 0) {
                return var1.field4510 == '\t' ? this.field4536.field4490.field4515[32] * 3 : this.field4536.field4490.field4515[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("pd.aa(I)Lti;")
    public class498 method7105() {
        if (this.method7089()) {
            return new class498(0, 0);
        } else {
            class409 var1 = this.field4536.method6868(this.field4538 - 1);
            return new class498(var1.field4509 + this.method7088(), var1.field4508);
        }
    }

    @ObfuscatedName("pd.ac(II)Lpn;")
    public class409 method7094(int arg0) {
        return arg0 >= 0 && arg0 < this.method7100() ? this.field4536.method6868(this.field4537 + arg0) : null;
    }
}
