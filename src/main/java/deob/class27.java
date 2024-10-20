package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("av")
public class class27 {

    @ObfuscatedName("av.s")
    public int field215 = -1;

    @ObfuscatedName("av.j")
    public String field204;

    @ObfuscatedName("av.i")
    public String field203;

    @ObfuscatedName("av.k")
    public int field206 = -1;

    @ObfuscatedName("av.u")
    public int field214 = -1;

    @ObfuscatedName("av.n")
    public class214 field208 = null;

    @ObfuscatedName("av.t")
    public int field207 = Integer.MAX_VALUE;

    @ObfuscatedName("av.q")
    public int field209 = 0;

    @ObfuscatedName("av.x")
    public int field211 = Integer.MAX_VALUE;

    @ObfuscatedName("av.d")
    public int field212 = 0;

    @ObfuscatedName("av.f")
    public boolean field213 = false;

    @ObfuscatedName("av.c")
    public LinkedList field210;

    @ObfuscatedName("av.s(Lky;IB)V")
    public void method271(class300 arg0, int arg1) {
        this.field215 = arg1;
        this.field204 = arg0.method5150();
        this.field203 = arg0.method5150();
        this.field208 = new class214(arg0.method5056());
        this.field206 = arg0.method5056();
        arg0.method5179();
        this.field213 = arg0.method5179() == 1;
        this.field214 = arg0.method5179();
        int var3 = arg0.method5179();
        this.field210 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field210.add(this.method270(arg0));
        }
        this.method301();
    }

    @ObfuscatedName("av.j(Lky;I)Lac;")
    public class38 method270(class300 arg0) {
        int var2 = arg0.method5179();
        class21[] var3 = new class21[] { class21.field140, class21.field141, class21.field139, class21.field145 };
        class21 var4 = (class21) class196.method1723(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field142) {
            case 0:
                var6 = new class20();
                break;
            case 1:
                var6 = new class34();
                break;
            case 2:
                var6 = new class43();
                break;
            case 3:
                var6 = new class25();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class38) var6).method191(arg0);
        return (class38) var6;
    }

    @ObfuscatedName("av.i(IIIB)Z")
    public boolean method272(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field210.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class38) var4.next();
        } while (!var5.method187(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("av.k(III)Z")
    public boolean method273(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field207 || var3 > this.field209) {
            return false;
        } else if (var4 >= this.field211 && var4 <= this.field212) {
            Iterator var5 = this.field210.iterator();
            class38 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class38) var5.next();
            } while (!var6.method208(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.u(IIII)[I")
    public int[] method274(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field210.iterator();
        class38 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class38) var4.next();
        } while (!var5.method187(arg0, arg1, arg2));
        return var5.method189(arg0, arg1, arg2);
    }

    @ObfuscatedName("av.n(III)Lhd;")
    public class214 method275(int arg0, int arg1) {
        Iterator var3 = this.field210.iterator();
        class38 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class38) var3.next();
        } while (!var4.method208(arg0, arg1));
        return var4.method185(arg0, arg1);
    }

    @ObfuscatedName("av.t(I)V")
    public void method301() {
        Iterator var1 = this.field210.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var2.method210(this);
        }
    }

    @ObfuscatedName("av.q(I)I")
    public int method338() {
        return this.field215;
    }

    @ObfuscatedName("av.x(I)Z")
    public boolean method278() {
        return this.field213;
    }

    @ObfuscatedName("av.d(B)Ljava/lang/String;")
    public String method279() {
        return this.field204;
    }

    @ObfuscatedName("av.f(I)Ljava/lang/String;")
    public String method280() {
        return this.field203;
    }

    @ObfuscatedName("av.c(I)I")
    public int method281() {
        return this.field206;
    }

    @ObfuscatedName("av.r(I)I")
    public int method282() {
        return this.field214;
    }

    @ObfuscatedName("av.y(I)I")
    public int method283() {
        return this.field207;
    }

    @ObfuscatedName("av.p(I)I")
    public int method284() {
        return this.field209;
    }

    @ObfuscatedName("av.g(I)I")
    public int method290() {
        return this.field211;
    }

    @ObfuscatedName("av.e(I)I")
    public int method286() {
        return this.field212;
    }

    @ObfuscatedName("av.z(I)I")
    public int method287() {
        return this.field208.field2513;
    }

    @ObfuscatedName("av.w(B)I")
    public int method288() {
        return this.field208.field2515;
    }

    @ObfuscatedName("av.l(I)I")
    public int method289() {
        return this.field208.field2511;
    }

    @ObfuscatedName("av.h(B)Lhd;")
    public class214 method328() {
        return new class214(this.field208);
    }
}
