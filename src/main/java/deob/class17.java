package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("y")
public class class17 {

    @ObfuscatedName("y.g")
    public int field244;

    @ObfuscatedName("y.i")
    public byte[] field245 = new byte[4];

    @ObfuscatedName("y.k")
    public class133 field253;

    @ObfuscatedName("y.e")
    public DataInputStream field247;

    @ObfuscatedName("y.w")
    public int field246;

    @ObfuscatedName("y.m")
    public byte[] field251;

    @ObfuscatedName("y.u")
    public int field248;

    @ObfuscatedName("y.j")
    public long field249;

    public class17(class123 arg0, URL arg1) {
        this.field253 = arg0.method2484(arg1);
        this.field244 = 0;
        this.field249 = class103.method98() + 30000L;
    }

    @ObfuscatedName("y.g(B)[B")
    public byte[] method163() throws IOException {
        if (class103.method98() > this.field249) {
            throw new IOException();
        }
        if (this.field244 == 0) {
            if (this.field253.field2070 == 2) {
                throw new IOException();
            }
            if (this.field253.field2070 == 1) {
                this.field247 = (DataInputStream) this.field253.field2077;
                this.field244 = 1;
            }
        }
        if (this.field244 == 1) {
            int var1 = this.field247.available();
            if (var1 > 0) {
                if (this.field246 + var1 > 4) {
                    var1 = 4 - this.field246;
                }
                this.field246 += this.field247.read(this.field245, this.field246, var1);
                if (this.field246 == 4) {
                    int var2 = (new class107(this.field245)).method2112();
                    this.field251 = new byte[var2];
                    this.field244 = 2;
                }
            }
        }
        if (this.field244 == 2) {
            int var3 = this.field247.available();
            if (var3 > 0) {
                if (this.field248 + var3 > this.field251.length) {
                    var3 = this.field251.length - this.field248;
                }
                this.field248 += this.field247.read(this.field251, this.field248, var3);
                if (this.field248 == this.field251.length) {
                    return this.field251;
                }
            }
        }
        return null;
    }
}
