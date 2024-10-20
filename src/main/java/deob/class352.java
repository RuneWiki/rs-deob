package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("mo")
public abstract class class352 {

    @ObfuscatedName("mo.n")
    public final int field4116;

    @ObfuscatedName("mo.r")
    public int field4112 = 0;

    @ObfuscatedName("mo.o")
    public class350[] field4111;

    @ObfuscatedName("mo.v")
    public HashMap field4113;

    @ObfuscatedName("mo.d")
    public HashMap field4115;

    @ObfuscatedName("mo.h")
    public Comparator field4114 = null;

    public class352(int arg0) {
        this.field4116 = arg0;
        this.field4111 = this.method5692(arg0);
        this.field4113 = new HashMap(arg0 / 8);
        this.field4115 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("mo.ax(I)V")
    public void method5793() {
        this.field4112 = 0;
        Arrays.fill(this.field4111, (Object) null);
        this.field4113.clear();
        this.field4115.clear();
    }

    @ObfuscatedName("mo.am(B)I")
    public int method5794() {
        return this.field4112;
    }

    @ObfuscatedName("mo.az(I)Z")
    public boolean method5795() {
        return this.field4116 == this.field4112;
    }

    @ObfuscatedName("mo.au(Lpo;I)Z")
    public boolean method5822(class440 arg0) {
        if (arg0.method7189()) {
            return this.field4113.containsKey(arg0) ? true : this.field4115.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mo.av(Lpo;I)Lmv;")
    public class350 method5797(class440 arg0) {
        class350 var2 = this.method5798(arg0);
        return var2 == null ? this.method5799(arg0) : var2;
    }

    @ObfuscatedName("mo.ap(Lpo;I)Lmv;")
    public class350 method5798(class440 arg0) {
        return arg0.method7189() ? (class350) this.field4113.get(arg0) : null;
    }

    @ObfuscatedName("mo.ac(Lpo;I)Lmv;")
    public class350 method5799(class440 arg0) {
        return arg0.method7189() ? (class350) this.field4115.get(arg0) : null;
    }

    @ObfuscatedName("mo.aj(Lpo;I)Z")
    public final boolean method5800(class440 arg0) {
        class350 var2 = this.method5798(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5815(var2);
            return true;
        }
    }

    @ObfuscatedName("mo.af(Lmv;I)V")
    public final void method5815(class350 arg0) {
        int var2 = this.method5846(arg0);
        if (var2 != -1) {
            this.method5811(var2);
            this.method5839(arg0);
        }
    }

    @ObfuscatedName("mo.ar(Lpo;B)Lmv;")
    public class350 method5802(class440 arg0) {
        return this.method5803(arg0, (class440) null);
    }

    @ObfuscatedName("mo.ag(Lpo;Lpo;I)Lmv;")
    public class350 method5803(class440 arg0, class440 arg1) {
        if (this.method5798(arg0) != null) {
            throw new IllegalStateException();
        }
        class350 var3 = this.method5691();
        var3.method5772(arg0, arg1);
        this.method5807(var3);
        this.method5852(var3);
        return var3;
    }

    @ObfuscatedName("mo.al(IB)Lmv;")
    public final class350 method5804(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4112) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4111[arg0];
    }

    @ObfuscatedName("mo.aa(I)V")
    public final void method5805() {
        if (this.field4114 == null) {
            Arrays.sort(this.field4111, 0, this.field4112);
        } else {
            Arrays.sort(this.field4111, 0, this.field4112, this.field4114);
        }
    }

    @ObfuscatedName("mo.as(Lmv;Lpo;Lpo;B)V")
    public final void method5806(class350 arg0, class440 arg1, class440 arg2) {
        this.method5839(arg0);
        arg0.method5772(arg1, arg2);
        this.method5852(arg0);
    }

    @ObfuscatedName("mo.at(Lmv;I)I")
    public final int method5846(class350 arg0) {
        for (int var2 = 0; var2 < this.field4112; var2++) {
            if (this.field4111[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("mo.ai(Lmv;B)V")
    public final void method5839(class350 arg0) {
        if (this.field4113.remove(arg0.field4106) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4104 != null) {
            this.field4115.remove(arg0.field4104);
        }
    }

    @ObfuscatedName("mo.aq(Lmv;I)V")
    public final void method5807(class350 arg0) {
        this.field4111[++this.field4112 - 1] = arg0;
    }

    @ObfuscatedName("mo.aw(Lmv;B)V")
    public final void method5852(class350 arg0) {
        this.field4113.put(arg0.field4106, arg0);
        if (arg0.field4104 != null) {
            class350 var2 = (class350) this.field4115.put(arg0.field4104, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4104 = null;
            }
        }
    }

    @ObfuscatedName("mo.ay(II)V")
    public final void method5811(int arg0) {
        this.field4112--;
        if (arg0 < this.field4112) {
            System.arraycopy(this.field4111, arg0 + 1, this.field4111, arg0, this.field4112 - arg0);
        }
    }

    @ObfuscatedName("mo.ae(I)V")
    public final void method5813() {
        this.field4114 = null;
    }

    @ObfuscatedName("mo.ak(Ljava/util/Comparator;B)V")
    public final void method5814(Comparator arg0) {
        if (this.field4114 == null) {
            this.field4114 = arg0;
        } else if (this.field4114 instanceof class351) {
            ((class351) this.field4114).method5782(arg0);
        }
    }

    @ObfuscatedName("mo.b(II)[Lmv;")
    public abstract class350[] method5692(int arg0);

    @ObfuscatedName("mo.c(B)Lmv;")
    public abstract class350 method5691();
}
