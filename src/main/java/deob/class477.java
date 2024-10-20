package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("sz")
public abstract class class477 {

    @ObfuscatedName("sz.am")
    public final int field5018;

    @ObfuscatedName("sz.at")
    public int field5014 = 0;

    @ObfuscatedName("sz.au")
    public class475[] field5015;

    @ObfuscatedName("sz.an")
    public HashMap field5016;

    @ObfuscatedName("sz.ao")
    public HashMap field5017;

    @ObfuscatedName("sz.af")
    public Comparator field5019 = null;

    public class477(int arg0) {
        this.field5018 = arg0;
        this.field5015 = this.method8258(arg0);
        this.field5016 = new HashMap(arg0 / 8);
        this.field5017 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("sz.bk(I)V")
    public void method8379() {
        this.field5014 = 0;
        Arrays.fill(this.field5015, (Object) null);
        this.field5016.clear();
        this.field5017.clear();
    }

    @ObfuscatedName("sz.bb(B)I")
    public int method8356() {
        return this.field5014;
    }

    @ObfuscatedName("sz.bq(B)Z")
    public boolean method8357() {
        return this.field5018 == this.field5014;
    }

    @ObfuscatedName("sz.bp(Lwx;I)Z")
    public boolean method8358(class581 arg0) {
        if (arg0.method9994()) {
            return this.field5016.containsKey(arg0) ? true : this.field5017.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("sz.bz(Lwx;I)Lse;")
    public class475 method8359(class581 arg0) {
        class475 var2 = this.method8360(arg0);
        return var2 == null ? this.method8361(arg0) : var2;
    }

    @ObfuscatedName("sz.bc(Lwx;B)Lse;")
    public class475 method8360(class581 arg0) {
        return arg0.method9994() ? (class475) this.field5016.get(arg0) : null;
    }

    @ObfuscatedName("sz.by(Lwx;I)Lse;")
    public class475 method8361(class581 arg0) {
        return arg0.method9994() ? (class475) this.field5017.get(arg0) : null;
    }

    @ObfuscatedName("sz.br(Lwx;I)Z")
    public final boolean method8362(class581 arg0) {
        class475 var2 = this.method8360(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method8363(var2);
            return true;
        }
    }

    @ObfuscatedName("sz.bn(Lse;I)V")
    public final void method8363(class475 arg0) {
        int var2 = this.method8369(arg0);
        if (var2 != -1) {
            this.method8390(var2);
            this.method8394(arg0);
        }
    }

    @ObfuscatedName("sz.bu(Lwx;I)Lse;")
    public class475 method8364(class581 arg0) {
        return this.method8365(arg0, (class581) null);
    }

    @ObfuscatedName("sz.bt(Lwx;Lwx;S)Lse;")
    public class475 method8365(class581 arg0, class581 arg1) {
        if (this.method8360(arg0) != null) {
            throw new IllegalStateException();
        }
        class475 var3 = this.method8257();
        var3.method8339(arg0, arg1);
        this.method8371(var3);
        this.method8372(var3);
        return var3;
    }

    @ObfuscatedName("sz.bs(II)Lse;")
    public final class475 method8366(int arg0) {
        if (arg0 < 0 || arg0 >= this.field5014) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field5015[arg0];
    }

    @ObfuscatedName("sz.bm(B)V")
    public final void method8367() {
        if (this.field5019 == null) {
            Arrays.sort(this.field5015, 0, this.field5014);
        } else {
            Arrays.sort(this.field5015, 0, this.field5014, this.field5019);
        }
    }

    @ObfuscatedName("sz.bo(Lse;Lwx;Lwx;I)V")
    public final void method8368(class475 arg0, class581 arg1, class581 arg2) {
        this.method8394(arg0);
        arg0.method8339(arg1, arg2);
        this.method8372(arg0);
    }

    @ObfuscatedName("sz.bd(Lse;B)I")
    public final int method8369(class475 arg0) {
        for (int var2 = 0; var2 < this.field5014; var2++) {
            if (this.field5015[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("sz.ba(Lse;B)V")
    public final void method8394(class475 arg0) {
        if (this.field5016.remove(arg0.field5009) == null) {
            throw new IllegalStateException();
        } else if (arg0.field5008 != null) {
            this.field5017.remove(arg0.field5008);
        }
    }

    @ObfuscatedName("sz.bw(Lse;I)V")
    public final void method8371(class475 arg0) {
        this.field5015[++this.field5014 - 1] = arg0;
    }

    @ObfuscatedName("sz.bi(Lse;B)V")
    public final void method8372(class475 arg0) {
        this.field5016.put(arg0.field5009, arg0);
        if (arg0.field5008 != null) {
            class475 var2 = (class475) this.field5017.put(arg0.field5008, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field5008 = null;
            }
        }
    }

    @ObfuscatedName("sz.bf(IB)V")
    public final void method8390(int arg0) {
        this.field5014--;
        if (arg0 < this.field5014) {
            System.arraycopy(this.field5015, arg0 + 1, this.field5015, arg0, this.field5014 - arg0);
        }
    }

    @ObfuscatedName("sz.bg(B)V")
    public final void method8421() {
        this.field5019 = null;
    }

    @ObfuscatedName("sz.bl(Ljava/util/Comparator;B)V")
    public final void method8377(Comparator arg0) {
        if (this.field5019 == null) {
            this.field5019 = arg0;
        } else if (this.field5019 instanceof class476) {
            ((class476) this.field5019).method8349(arg0);
        }
    }

    @ObfuscatedName("sz.aw(II)[Lse;")
    public abstract class475[] method8258(int arg0);

    @ObfuscatedName("sz.ap(I)Lse;")
    public abstract class475 method8257();
}
