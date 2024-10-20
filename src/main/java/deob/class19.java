package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("u")
public class class19 {

    @ObfuscatedName("u.v")
    public int field261;

    @ObfuscatedName("u.f")
    public class146 field265;

    @ObfuscatedName("u.i")
    public byte[] field259 = new byte[4];

    @ObfuscatedName("u.d")
    public DataInputStream field258;

    @ObfuscatedName("u.o")
    public int field260;

    @ObfuscatedName("u.c")
    public byte[] field262;

    @ObfuscatedName("u.p")
    public int field268;

    @ObfuscatedName("u.j")
    public long field263;

    public class19(class136 arg0, URL arg1) {
        this.field265 = arg0.method2738(arg1);
        this.field261 = 0;
        this.field263 = class115.method819() + 30000L;
    }

    @ObfuscatedName("u.v(I)[B")
    public byte[] method198() throws IOException {
        if (class115.method819() > this.field263) {
            throw new IOException();
        }
        if (this.field261 == 0) {
            if (this.field265.field2222 == 2) {
                throw new IOException();
            }
            if (this.field265.field2222 == 1) {
                this.field258 = (DataInputStream) this.field265.field2226;
                this.field261 = 1;
            }
        }
        if (this.field261 == 1) {
            int var1 = this.field258.available();
            if (var1 > 0) {
                if (this.field260 + var1 > 4) {
                    var1 = 4 - this.field260;
                }
                this.field260 += this.field258.read(this.field259, this.field260, var1);
                if (this.field260 == 4) {
                    int var2 = (new class119(this.field259)).method2354();
                    this.field262 = new byte[var2];
                    this.field261 = 2;
                }
            }
        }
        if (this.field261 == 2) {
            int var3 = this.field258.available();
            if (var3 > 0) {
                if (this.field268 + var3 > this.field262.length) {
                    var3 = this.field262.length - this.field268;
                }
                this.field268 += this.field258.read(this.field262, this.field268, var3);
                if (this.field268 == this.field262.length) {
                    return this.field262;
                }
            }
        }
        return null;
    }
}
