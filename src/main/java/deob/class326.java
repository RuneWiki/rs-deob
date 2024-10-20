package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("lw")
public abstract class class326 {

    @ObfuscatedName("lw.o")
    public final int field3860;

    @ObfuscatedName("lw.x")
    public int field3858 = 0;

    @ObfuscatedName("lw.r")
    public class324[] field3859;

    @ObfuscatedName("lw.p")
    public HashMap field3861;

    @ObfuscatedName("lw.h")
    public HashMap field3862;

    @ObfuscatedName("lw.k")
    public Comparator field3857 = null;

    public class326(int arg0) {
        this.field3860 = arg0;
        this.field3859 = this.method5113(arg0);
        this.field3861 = new HashMap(arg0 / 8);
        this.field3862 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("lw.au(I)V")
    public void method5221() {
        this.field3858 = 0;
        Arrays.fill(this.field3859, (Object) null);
        this.field3861.clear();
        this.field3862.clear();
    }

    @ObfuscatedName("lw.av(B)I")
    public int method5235() {
        return this.field3858;
    }

    @ObfuscatedName("lw.as(I)Z")
    public boolean method5282() {
        return this.field3860 == this.field3858;
    }

    @ObfuscatedName("lw.ao(Loh;S)Z")
    public boolean method5243(class406 arg0) {
        if (arg0.method6522()) {
            return this.field3861.containsKey(arg0) ? true : this.field3862.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("lw.az(Loh;S)Llm;")
    public class324 method5224(class406 arg0) {
        class324 var2 = this.method5225(arg0);
        return var2 == null ? this.method5226(arg0) : var2;
    }

    @ObfuscatedName("lw.ak(Loh;B)Llm;")
    public class324 method5225(class406 arg0) {
        return arg0.method6522() ? (class324) this.field3861.get(arg0) : null;
    }

    @ObfuscatedName("lw.aj(Loh;I)Llm;")
    public class324 method5226(class406 arg0) {
        return arg0.method6522() ? (class324) this.field3862.get(arg0) : null;
    }

    @ObfuscatedName("lw.at(Loh;I)Z")
    public final boolean method5227(class406 arg0) {
        class324 var2 = this.method5225(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5228(var2);
            return true;
        }
    }

    @ObfuscatedName("lw.af(Llm;I)V")
    public final void method5228(class324 arg0) {
        int var2 = this.method5234(arg0);
        if (var2 != -1) {
            this.method5248(var2);
            this.method5220(arg0);
        }
    }

    @ObfuscatedName("lw.ar(Loh;I)Llm;")
    public class324 method5229(class406 arg0) {
        return this.method5272(arg0, (class406) null);
    }

    @ObfuscatedName("lw.ay(Loh;Loh;I)Llm;")
    public class324 method5272(class406 arg0, class406 arg1) {
        if (this.method5225(arg0) != null) {
            throw new IllegalStateException();
        }
        class324 var3 = this.method5114();
        var3.method5200(arg0, arg1);
        this.method5236(var3);
        this.method5237(var3);
        return var3;
    }

    @ObfuscatedName("lw.ap(IS)Llm;")
    public final class324 method5231(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3858) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3859[arg0];
    }

    @ObfuscatedName("lw.ah(I)V")
    public final void method5232() {
        if (this.field3857 == null) {
            Arrays.sort(this.field3859, 0, this.field3858);
        } else {
            Arrays.sort(this.field3859, 0, this.field3858, this.field3857);
        }
    }

    @ObfuscatedName("lw.ag(Llm;Loh;Loh;I)V")
    public final void method5233(class324 arg0, class406 arg1, class406 arg2) {
        this.method5220(arg0);
        arg0.method5200(arg1, arg2);
        this.method5237(arg0);
    }

    @ObfuscatedName("lw.ai(Llm;B)I")
    public final int method5234(class324 arg0) {
        for (int var2 = 0; var2 < this.field3858; var2++) {
            if (this.field3859[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("lw.ad(Llm;I)V")
    public final void method5220(class324 arg0) {
        if (this.field3861.remove(arg0.field3853) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3852 != null) {
            this.field3862.remove(arg0.field3852);
        }
    }

    @ObfuscatedName("lw.ac(Llm;I)V")
    public final void method5236(class324 arg0) {
        this.field3859[++this.field3858 - 1] = arg0;
    }

    @ObfuscatedName("lw.aw(Llm;I)V")
    public final void method5237(class324 arg0) {
        this.field3861.put(arg0.field3853, arg0);
        if (arg0.field3852 != null) {
            class324 var2 = (class324) this.field3862.put(arg0.field3852, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3852 = null;
            }
        }
    }

    @ObfuscatedName("lw.bt(II)V")
    public final void method5248(int arg0) {
        this.field3858--;
        if (arg0 < this.field3858) {
            System.arraycopy(this.field3859, arg0 + 1, this.field3859, arg0, this.field3858 - arg0);
        }
    }

    @ObfuscatedName("lw.bk(B)V")
    public final void method5279() {
        this.field3857 = null;
    }

    @ObfuscatedName("lw.br(Ljava/util/Comparator;I)V")
    public final void method5270(Comparator arg0) {
        if (this.field3857 == null) {
            this.field3857 = arg0;
        } else if (this.field3857 instanceof class325) {
            ((class325) this.field3857).method5213(arg0);
        }
    }

    @ObfuscatedName("lw.s(B)Llm;")
    public abstract class324 method5114();

    @ObfuscatedName("lw.t(II)[Llm;")
    public abstract class324[] method5113(int arg0);
}
