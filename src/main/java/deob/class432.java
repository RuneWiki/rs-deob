package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("qc")
public class class432 extends AbstractQueue {

    @ObfuscatedName("qc.ab")
    public class430[] field4721;

    @ObfuscatedName("qc.ay")
    public Map field4718;

    @ObfuscatedName("qc.an")
    public int field4719;

    @ObfuscatedName("qc.au")
    public final Comparator field4722;

    @ObfuscatedName("qc.ax")
    public int field4720;

    public class432(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class432(int arg0, Comparator arg1) {
        this.field4720 = 0;
        this.field4721 = new class430[arg0];
        this.field4718 = new HashMap();
        this.field4722 = arg1;
    }

    @ObfuscatedName("qc.ab(I)V")
    public void method7352() {
        int var1 = (this.field4721.length << 1) + 1;
        this.field4721 = (class430[]) ((class430[]) Arrays.copyOf(this.field4721, var1));
    }

    public int size() {
        return this.field4719;
    }

    public boolean offer(Object arg0) {
        if (this.field4718.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4720++;
        int var2 = this.field4719;
        if (var2 >= this.field4721.length) {
            this.method7352();
        }
        this.field4719++;
        if (var2 == 0) {
            this.field4721[0] = new class430(arg0, 0);
            this.field4718.put(arg0, this.field4721[0]);
        } else {
            this.field4721[var2] = new class430(arg0, var2);
            this.field4718.put(arg0, this.field4721[var2]);
            this.method7353(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4719 == 0 ? null : this.field4721[0].field4711;
    }

    public Object poll() {
        if (this.field4719 == 0) {
            return null;
        }
        this.field4720++;
        Object var1 = this.field4721[0].field4711;
        this.field4718.remove(var1);
        this.field4719--;
        if (this.field4719 == 0) {
            this.field4721[this.field4719] = null;
        } else {
            this.field4721[0] = this.field4721[this.field4719];
            this.field4721[0].field4710 = 0;
            this.field4721[this.field4719] = null;
            this.method7355(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class430 var2 = (class430) this.field4718.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4720++;
        this.field4719--;
        if (this.field4719 == var2.field4710) {
            this.field4721[this.field4719] = null;
            return true;
        }
        class430 var3 = this.field4721[this.field4719];
        this.field4721[this.field4719] = null;
        this.field4721[var2.field4710] = var3;
        this.field4721[var2.field4710].field4710 = var2.field4710;
        this.method7355(var2.field4710);
        if (this.field4721[var2.field4710] == var3) {
            this.method7353(var2.field4710);
        }
        return true;
    }

    @ObfuscatedName("qc.ay(II)V")
    public void method7353(int arg0) {
        class430 var2 = this.field4721[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class430 var4 = this.field4721[var3];
            if (this.field4722 == null) {
                if (((Comparable) var2.field4711).compareTo(var4.field4711) >= 0) {
                    break;
                }
            } else if (this.field4722.compare(var2.field4711, var4.field4711) >= 0) {
                break;
            }
            this.field4721[arg0] = var4;
            this.field4721[arg0].field4710 = arg0;
            arg0 = var3;
        }
        this.field4721[arg0] = var2;
        this.field4721[arg0].field4710 = arg0;
    }

    @ObfuscatedName("qc.an(II)V")
    public void method7355(int arg0) {
        class430 var2 = this.field4721[arg0];
        int var3 = this.field4719 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class430 var5 = this.field4721[var4];
            int var6 = (arg0 << 1) + 2;
            class430 var7 = this.field4721[var6];
            int var8;
            if (this.field4722 == null) {
                if (var6 < this.field4719 && ((Comparable) var5.field4711).compareTo(var7.field4711) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4719 && this.field4722.compare(var5.field4711, var7.field4711) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4722 == null) {
                if (((Comparable) var2.field4711).compareTo(this.field4721[var8].field4711) <= 0) {
                    break;
                }
            } else if (this.field4722.compare(var2.field4711, this.field4721[var8].field4711) <= 0) {
                break;
            }
            this.field4721[arg0] = this.field4721[var8];
            this.field4721[arg0].field4710 = arg0;
            arg0 = var8;
        }
        this.field4721[arg0] = var2;
        this.field4721[arg0].field4710 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4718.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4722 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4722);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class431(this);
    }
}
