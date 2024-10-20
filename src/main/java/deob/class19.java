package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("u")
public class class19 {

    @ObfuscatedName("u.z")
    public int field258;

    @ObfuscatedName("u.q")
    public class146 field255;

    @ObfuscatedName("u.k")
    public DataInputStream field256;

    @ObfuscatedName("u.f")
    public byte[] field257 = new byte[4];

    @ObfuscatedName("u.d")
    public int field254;

    @ObfuscatedName("u.l")
    public byte[] field259;

    @ObfuscatedName("u.r")
    public int field260;

    @ObfuscatedName("u.g")
    public long field261;

    public class19(class136 arg0, URL arg1) {
        this.field255 = arg0.method2677(arg1);
        this.field258 = 0;
        this.field261 = class115.method82() + 30000L;
    }

    @ObfuscatedName("u.z(I)[B")
    public byte[] method182() throws IOException {
        if (class115.method82() > this.field261) {
            throw new IOException();
        }
        if (this.field258 == 0) {
            if (this.field255.field2224 == 2) {
                throw new IOException();
            }
            if (this.field255.field2224 == 1) {
                this.field256 = (DataInputStream) this.field255.field2222;
                this.field258 = 1;
            }
        }
        if (this.field258 == 1) {
            int var1 = this.field256.available();
            if (var1 > 0) {
                if (this.field254 + var1 > 4) {
                    var1 = 4 - this.field254;
                }
                this.field254 += this.field256.read(this.field257, this.field254, var1);
                if (this.field254 == 4) {
                    int var2 = (new class119(this.field257)).method2306();
                    this.field259 = new byte[var2];
                    this.field258 = 2;
                }
            }
        }
        if (this.field258 == 2) {
            int var3 = this.field256.available();
            if (var3 > 0) {
                if (this.field260 + var3 > this.field259.length) {
                    var3 = this.field259.length - this.field260;
                }
                this.field260 += this.field256.read(this.field259, this.field260, var3);
                if (this.field260 == this.field259.length) {
                    return this.field259;
                }
            }
        }
        return null;
    }
}
