package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("r")
public class class19 {

    @ObfuscatedName("r.k")
    public int field253;

    @ObfuscatedName("r.q")
    public class150 field255;

    @ObfuscatedName("r.f")
    public DataInputStream field254;

    @ObfuscatedName("r.c")
    public byte[] field257 = new byte[4];

    @ObfuscatedName("r.v")
    public int field256;

    @ObfuscatedName("r.j")
    public byte[] field252;

    @ObfuscatedName("r.m")
    public int field258;

    @ObfuscatedName("r.y")
    public long field259;

    public class19(class140 arg0, URL arg1) {
        this.field255 = arg0.method2768(arg1);
        this.field253 = 0;
        this.field259 = class119.method3068() + 30000L;
    }

    @ObfuscatedName("r.k(I)[B")
    public byte[] method178() throws IOException {
        if (class119.method3068() > this.field259) {
            throw new IOException();
        }
        if (this.field253 == 0) {
            if (this.field255.field2269 == 2) {
                throw new IOException();
            }
            if (this.field255.field2269 == 1) {
                this.field254 = (DataInputStream) this.field255.field2263;
                this.field253 = 1;
            }
        }
        if (this.field253 == 1) {
            int var1 = this.field254.available();
            if (var1 > 0) {
                if (this.field256 + var1 > 4) {
                    var1 = 4 - this.field256;
                }
                this.field256 += this.field254.read(this.field257, this.field256, var1);
                if (this.field256 == 4) {
                    int var2 = (new class123(this.field257)).method2432();
                    this.field252 = new byte[var2];
                    this.field253 = 2;
                }
            }
        }
        if (this.field253 == 2) {
            int var3 = this.field254.available();
            if (var3 > 0) {
                if (this.field258 + var3 > this.field252.length) {
                    var3 = this.field252.length - this.field258;
                }
                this.field258 += this.field254.read(this.field252, this.field258, var3);
                if (this.field258 == this.field252.length) {
                    return this.field252;
                }
            }
        }
        return null;
    }
}
