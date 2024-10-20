package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("h")
public class class18 {

    @ObfuscatedName("h.y")
    public int field251;

    @ObfuscatedName("h.k")
    public class138 field249;

    @ObfuscatedName("h.g")
    public DataInputStream field253;

    @ObfuscatedName("h.n")
    public byte[] field256 = new byte[4];

    @ObfuscatedName("h.t")
    public int field252;

    @ObfuscatedName("h.e")
    public byte[] field255;

    @ObfuscatedName("h.q")
    public int field250;

    @ObfuscatedName("h.z")
    public long field248;

    public class18(class128 arg0, URL arg1) {
        this.field249 = arg0.method2542(arg1);
        this.field251 = 0;
        this.field248 = class107.method78() + 30000L;
    }

    @ObfuscatedName("h.y(B)[B")
    public byte[] method163() throws IOException {
        if (class107.method78() > this.field248) {
            throw new IOException();
        }
        if (this.field251 == 0) {
            if (this.field249.field2138 == 2) {
                throw new IOException();
            }
            if (this.field249.field2138 == 1) {
                this.field253 = (DataInputStream) this.field249.field2134;
                this.field251 = 1;
            }
        }
        if (this.field251 == 1) {
            int var1 = this.field253.available();
            if (var1 > 0) {
                if (this.field252 + var1 > 4) {
                    var1 = 4 - this.field252;
                }
                this.field252 += this.field253.read(this.field256, this.field252, var1);
                if (this.field252 == 4) {
                    int var2 = (new class111(this.field256)).method2165();
                    this.field255 = new byte[var2];
                    this.field251 = 2;
                }
            }
        }
        if (this.field251 == 2) {
            int var3 = this.field253.available();
            if (var3 > 0) {
                if (this.field250 + var3 > this.field255.length) {
                    var3 = this.field255.length - this.field250;
                }
                this.field250 += this.field253.read(this.field255, this.field250, var3);
                if (this.field250 == this.field255.length) {
                    return this.field255;
                }
            }
        }
        return null;
    }
}
