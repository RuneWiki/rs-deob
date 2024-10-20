package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("hi")
public class class222 extends class201 {

    @ObfuscatedName("hi.w")
    public HashSet field2427;

    @ObfuscatedName("hi.k")
    public HashSet field2428;

    @ObfuscatedName("hi.d")
    public List field2426;

    @ObfuscatedName("hi.cm(Lpi;Lpi;IZB)V")
    public void method3976(class438 arg0, class438 arg1, int arg2, boolean arg3) {
        this.method3674(arg0, arg2);
        int var5 = arg1.method7148();
        this.field2427 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class196 var7 = new class196();
            try {
                var7.method3547(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2427.add(var7);
        }
        int var9 = arg1.method7148();
        this.field2428 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class204 var11 = new class204();
            try {
                var11.method3856(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2428.add(var11);
        }
        this.method3977(arg1, arg3);
    }

    @ObfuscatedName("hi.cc(Lpi;ZI)V")
    public void method3977(class438 arg0, boolean arg1) {
        this.field2426 = new LinkedList();
        int var3 = arg0.method7148();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6989();
            class290 var6 = new class290(arg0.method6976());
            boolean var7 = arg0.method6971() == 1;
            if (arg1 || !var7) {
                this.field2426.add(new class207((class290) null, var6, var5, (class214) null));
            }
        }
    }
}
