package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("g")
public class class19 {

    @ObfuscatedName("g.i")
    public byte[] field257 = new byte[4];

    @ObfuscatedName("g.v")
    public int field262;

    @ObfuscatedName("g.r")
    public class146 field255;

    @ObfuscatedName("g.n")
    public DataInputStream field256;

    @ObfuscatedName("g.x")
    public int field254;

    @ObfuscatedName("g.q")
    public byte[] field259;

    @ObfuscatedName("g.h")
    public int field260;

    @ObfuscatedName("g.d")
    public long field261;

    public class19(class136 arg0, URL arg1) {
        this.field255 = arg0.method2699(arg1);
        this.field262 = 0;
        this.field261 = class115.method2134() + 30000L;
    }

    @ObfuscatedName("g.i(I)[B")
    public byte[] method169() throws IOException {
        if (class115.method2134() > this.field261) {
            throw new IOException();
        }
        if (this.field262 == 0) {
            if (this.field255.field2194 == 2) {
                throw new IOException();
            }
            if (this.field255.field2194 == 1) {
                this.field256 = (DataInputStream) this.field255.field2197;
                this.field262 = 1;
            }
        }
        if (this.field262 == 1) {
            int var1 = this.field256.available();
            if (var1 > 0) {
                if (this.field254 + var1 > 4) {
                    var1 = 4 - this.field254;
                }
                this.field254 += this.field256.read(this.field257, this.field254, var1);
                if (this.field254 == 4) {
                    int var2 = (new class119(this.field257)).method2350();
                    this.field259 = new byte[var2];
                    this.field262 = 2;
                }
            }
        }
        if (this.field262 == 2) {
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
