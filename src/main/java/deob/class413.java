package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pt")
public class class413 extends AbstractQueue {

    @ObfuscatedName("pt.az")
    public class411[] field4585;

    @ObfuscatedName("pt.ah")
    public Map field4579;

    @ObfuscatedName("pt.af")
    public int field4581;

    @ObfuscatedName("pt.at")
    public final Comparator field4582;

    @ObfuscatedName("pt.an")
    public int field4583;

    public class413(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class413(int arg0, Comparator arg1) {
        this.field4583 = 0;
        this.field4585 = new class411[arg0];
        this.field4579 = new HashMap();
        this.field4582 = arg1;
    }

    @ObfuscatedName("pt.az(I)V")
    public void method6851() {
        int var1 = (this.field4585.length << 1) + 1;
        this.field4585 = (class411[]) ((class411[]) Arrays.copyOf(this.field4585, var1));
    }

    public int size() {
        return this.field4581;
    }

    public boolean offer(Object arg0) {
        if (this.field4579.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4583++;
        int var2 = this.field4581;
        if (var2 >= this.field4585.length) {
            this.method6851();
        }
        this.field4581++;
        if (var2 == 0) {
            this.field4585[0] = new class411(arg0, 0);
            this.field4579.put(arg0, this.field4585[0]);
        } else {
            this.field4585[var2] = new class411(arg0, var2);
            this.field4579.put(arg0, this.field4585[var2]);
            this.method6833(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4581 == 0 ? null : this.field4585[0].field4574;
    }

    public Object poll() {
        if (this.field4581 == 0) {
            return null;
        }
        this.field4583++;
        Object var1 = this.field4585[0].field4574;
        this.field4579.remove(var1);
        this.field4581--;
        if (this.field4581 == 0) {
            this.field4585[this.field4581] = null;
        } else {
            this.field4585[0] = this.field4585[this.field4581];
            this.field4585[0].field4573 = 0;
            this.field4585[this.field4581] = null;
            this.method6834(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class411 var2 = (class411) this.field4579.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4583++;
        this.field4581--;
        if (this.field4581 == var2.field4573) {
            this.field4585[this.field4581] = null;
            return true;
        }
        class411 var3 = this.field4585[this.field4581];
        this.field4585[this.field4581] = null;
        this.field4585[var2.field4573] = var3;
        this.field4585[var2.field4573].field4573 = var2.field4573;
        this.method6834(var2.field4573);
        if (this.field4585[var2.field4573] == var3) {
            this.method6833(var2.field4573);
        }
        return true;
    }

    @ObfuscatedName("pt.ah(II)V")
    public void method6833(int arg0) {
        class411 var2 = this.field4585[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class411 var4 = this.field4585[var3];
            if (this.field4582 == null) {
                if (((Comparable) var2.field4574).compareTo(var4.field4574) >= 0) {
                    break;
                }
            } else if (this.field4582.compare(var2.field4574, var4.field4574) >= 0) {
                break;
            }
            this.field4585[arg0] = var4;
            this.field4585[arg0].field4573 = arg0;
            arg0 = var3;
        }
        this.field4585[arg0] = var2;
        this.field4585[arg0].field4573 = arg0;
    }

    @ObfuscatedName("pt.af(IB)V")
    public void method6834(int arg0) {
        class411 var2 = this.field4585[arg0];
        int var3 = this.field4581 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class411 var5 = this.field4585[var4];
            int var6 = (arg0 << 1) + 2;
            class411 var7 = this.field4585[var6];
            int var8;
            if (this.field4582 == null) {
                if (var6 < this.field4581 && ((Comparable) var5.field4574).compareTo(var7.field4574) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4581 && this.field4582.compare(var5.field4574, var7.field4574) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4582 == null) {
                if (((Comparable) var2.field4574).compareTo(this.field4585[var8].field4574) <= 0) {
                    break;
                }
            } else if (this.field4582.compare(var2.field4574, this.field4585[var8].field4574) <= 0) {
                break;
            }
            this.field4585[arg0] = this.field4585[var8];
            this.field4585[arg0].field4573 = arg0;
            arg0 = var8;
        }
        this.field4585[arg0] = var2;
        this.field4585[arg0].field4573 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4579.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4582 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4582);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class412(this);
    }
}
