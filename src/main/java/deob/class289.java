package deob;

@ObfuscatedName("ll")
public abstract class class289 {

    @ObfuscatedName("ll.ar")
    public final class337 field3086;

    @ObfuscatedName("ll.ab")
    public final class337 field3085;

    @ObfuscatedName("ll.am")
    public int field3088;

    @ObfuscatedName("ll.av")
    public int field3087;

    public class289(class337 arg0, class337 arg1) {
        this.field3085 = arg0;
        this.field3086 = arg1;
    }

    @ObfuscatedName("ll.as(III)Z")
    public boolean method5183(int arg0, int arg1) {
        if (this.method5194(arg0, arg1)) {
            return true;
        } else {
            return this.method5186(arg0, arg1);
        }
    }

    @ObfuscatedName("ll.aj(I)Z")
    public boolean method5184() {
        return this.method4809() >= 0;
    }

    @ObfuscatedName("ll.an(IIB)Z")
    public boolean method5194(int arg0, int arg1) {
        if (!this.method5184()) {
            return false;
        }
        class195 var3 = class195.method2991(this.method4809());
        int var4 = this.method4811();
        int var5 = this.method4807();
        switch(var3.field1950.field2031) {
            case 0:
                if (arg0 >= this.field3088 - var4 / 2 && arg0 <= var4 / 2 + this.field3088) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field3088 - var4 && arg0 <= this.field3088) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3088 || arg0 >= this.field3088 + var4) {
                    return false;
                }
        }
        switch(var3.field1932.field2100) {
            case 0:
                if (arg1 >= this.field3087 - var5 / 2 && arg1 <= var5 / 2 + this.field3087) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field3087 - var5 || arg1 > this.field3087) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3087 || arg1 >= this.field3087 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ll.au(IIB)Z")
    public boolean method5186(int arg0, int arg1) {
        class284 var3 = this.method4808();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3088 - var3.field3058 / 2 && arg0 <= var3.field3058 / 2 + this.field3088) {
            return arg1 >= this.field3087 && arg1 <= this.field3087 + var3.field3056;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ll.al(I)I")
    public abstract int method4809();

    @ObfuscatedName("ll.ak(B)Lkd;")
    public abstract class284 method4808();

    @ObfuscatedName("ll.ax(B)I")
    public abstract int method4811();

    @ObfuscatedName("ll.ao(I)I")
    public abstract int method4807();
}
