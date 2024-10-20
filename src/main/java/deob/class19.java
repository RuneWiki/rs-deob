package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("a")
public class class19 {

    @ObfuscatedName("a.x")
    public int field260;

    @ObfuscatedName("a.r")
    public class150 field259;

    @ObfuscatedName("a.j")
    public DataInputStream field263;

    @ObfuscatedName("a.z")
    public byte[] field261 = new byte[4];

    @ObfuscatedName("a.i")
    public int field262;

    @ObfuscatedName("a.b")
    public byte[] field268;

    @ObfuscatedName("a.l")
    public int field264;

    @ObfuscatedName("a.m")
    public long field265;

    public class19(class140 arg0, URL arg1) {
        this.field259 = arg0.method2774(arg1);
        this.field260 = 0;
        this.field265 = class119.method698() + 30000L;
    }

    @ObfuscatedName("a.x(I)[B")
    public byte[] method190() throws IOException {
        if (class119.method698() > this.field265) {
            throw new IOException();
        }
        if (this.field260 == 0) {
            if (this.field259.field2267 == 2) {
                throw new IOException();
            }
            if (this.field259.field2267 == 1) {
                this.field263 = (DataInputStream) this.field259.field2271;
                this.field260 = 1;
            }
        }
        if (this.field260 == 1) {
            int var1 = this.field263.available();
            if (var1 > 0) {
                if (this.field262 + var1 > 4) {
                    var1 = 4 - this.field262;
                }
                this.field262 += this.field263.read(this.field261, this.field262, var1);
                if (this.field262 == 4) {
                    int var2 = (new class123(this.field261)).method2413();
                    this.field268 = new byte[var2];
                    this.field260 = 2;
                }
            }
        }
        if (this.field260 == 2) {
            int var3 = this.field263.available();
            if (var3 > 0) {
                if (this.field264 + var3 > this.field268.length) {
                    var3 = this.field268.length - this.field264;
                }
                this.field264 += this.field263.read(this.field268, this.field264, var3);
                if (this.field264 == this.field268.length) {
                    return this.field268;
                }
            }
        }
        return null;
    }
}
