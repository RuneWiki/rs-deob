package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("fr")
public class class165 extends class144 {

    @ObfuscatedName("fr.d")
    public HashSet field1770;

    @ObfuscatedName("fr.c")
    public HashSet field1771;

    @ObfuscatedName("fr.j")
    public List field1772;

    @ObfuscatedName("fr.bm(Lnu;Lnu;IZI)V")
    public void method2775(class382 arg0, class382 arg1, int arg2, boolean arg3) {
        this.method2487(arg0, arg2);
        int var5 = arg1.method5858();
        this.field1770 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class139 var7 = new class139();
            try {
                var7.method2346(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field1770.add(var7);
        }
        int var9 = arg1.method5858();
        this.field1771 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class147 var11 = new class147();
            try {
                var11.method2660(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field1771.add(var11);
        }
        this.method2782(arg1, arg3);
    }

    @ObfuscatedName("fr.bz(Lnu;ZI)V")
    public void method2782(class382 arg0, boolean arg1) {
        this.field1772 = new LinkedList();
        int var3 = arg0.method5858();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5873();
            class221 var6 = new class221(arg0.method5861());
            boolean var7 = arg0.method5856() == 1;
            if (arg1 || !var7) {
                this.field1772.add(new class150((class221) null, var6, var5, (class157) null));
            }
        }
    }
}
