package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("q")
public class class19 {

    @ObfuscatedName("q.f")
    public int field263;

    @ObfuscatedName("q.e")
    public class150 field253;

    @ObfuscatedName("q.n")
    public DataInputStream field262;

    @ObfuscatedName("q.t")
    public byte[] field254 = new byte[4];

    @ObfuscatedName("q.v")
    public int field259;

    @ObfuscatedName("q.b")
    public byte[] field257;

    @ObfuscatedName("q.m")
    public int field258;

    @ObfuscatedName("q.k")
    public long field255;

    public class19(class140 arg0, URL arg1) {
        this.field253 = arg0.method2778(arg1);
        this.field263 = 0;
        this.field255 = class119.method137() + 30000L;
    }

    @ObfuscatedName("q.f(I)[B")
    public byte[] method185() throws IOException {
        if (class119.method137() > this.field255) {
            throw new IOException();
        }
        if (this.field263 == 0) {
            if (this.field253.field2263 == 2) {
                throw new IOException();
            }
            if (this.field253.field2263 == 1) {
                this.field262 = (DataInputStream) this.field253.field2267;
                this.field263 = 1;
            }
        }
        if (this.field263 == 1) {
            int var1 = this.field262.available();
            if (var1 > 0) {
                if (this.field259 + var1 > 4) {
                    var1 = 4 - this.field259;
                }
                this.field259 += this.field262.read(this.field254, this.field259, var1);
                if (this.field259 == 4) {
                    int var2 = (new class123(this.field254)).method2404();
                    this.field257 = new byte[var2];
                    this.field263 = 2;
                }
            }
        }
        if (this.field263 == 2) {
            int var3 = this.field262.available();
            if (var3 > 0) {
                if (this.field258 + var3 > this.field257.length) {
                    var3 = this.field257.length - this.field258;
                }
                this.field258 += this.field262.read(this.field257, this.field258, var3);
                if (this.field258 == this.field257.length) {
                    return this.field257;
                }
            }
        }
        return null;
    }
}
