package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("u")
public class class17 {

    @ObfuscatedName("u.n")
    public int field244;

    @ObfuscatedName("u.x")
    public class133 field252;

    @ObfuscatedName("u.k")
    public DataInputStream field250;

    @ObfuscatedName("u.i")
    public byte[] field248 = new byte[4];

    @ObfuscatedName("u.d")
    public int field246;

    @ObfuscatedName("u.q")
    public byte[] field247;

    @ObfuscatedName("u.m")
    public int field242;

    @ObfuscatedName("u.a")
    public long field249;

    public class17(class123 arg0, URL arg1) {
        this.field252 = arg0.method2460(arg1);
        this.field244 = 0;
        this.field249 = class103.method1066() + 30000L;
    }

    @ObfuscatedName("u.n(I)[B")
    public byte[] method163() throws IOException {
        if (class103.method1066() > this.field249) {
            throw new IOException();
        }
        if (this.field244 == 0) {
            if (this.field252.field2045 == 2) {
                throw new IOException();
            }
            if (this.field252.field2045 == 1) {
                this.field250 = (DataInputStream) this.field252.field2049;
                this.field244 = 1;
            }
        }
        if (this.field244 == 1) {
            int var1 = this.field250.available();
            if (var1 > 0) {
                if (this.field246 + var1 > 4) {
                    var1 = 4 - this.field246;
                }
                this.field246 += this.field250.read(this.field248, this.field246, var1);
                if (this.field246 == 4) {
                    int var2 = (new class107(this.field248)).method2183();
                    this.field247 = new byte[var2];
                    this.field244 = 2;
                }
            }
        }
        if (this.field244 == 2) {
            int var3 = this.field250.available();
            if (var3 > 0) {
                if (this.field242 + var3 > this.field247.length) {
                    var3 = this.field247.length - this.field242;
                }
                this.field242 += this.field250.read(this.field247, this.field242, var3);
                if (this.field242 == this.field247.length) {
                    return this.field247;
                }
            }
        }
        return null;
    }
}
