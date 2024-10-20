package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("bb")
public class class78 {

    @ObfuscatedName("bb.p")
    public int field1207;

    @ObfuscatedName("bb.m")
    public class154 field1201;

    @ObfuscatedName("bb.e")
    public DataInputStream field1202;

    @ObfuscatedName("bb.t")
    public byte[] field1205 = new byte[4];

    @ObfuscatedName("bb.w")
    public int field1200;

    @ObfuscatedName("bb.z")
    public byte[] field1204;

    @ObfuscatedName("bb.j")
    public int field1206;

    @ObfuscatedName("bb.i")
    public long field1203;

    public class78(class155 arg0, URL arg1) {
        this.field1201 = arg0.method2630(arg1);
        this.field1207 = 0;
        this.field1203 = class176.method2747() + 30000L;
    }

    @ObfuscatedName("bb.p(I)[B")
    public byte[] method1345() throws IOException {
        if (class176.method2747() > this.field1203) {
            throw new IOException();
        }
        if (this.field1207 == 0) {
            if (this.field1201.field2238 == 2) {
                throw new IOException();
            }
            if (this.field1201.field2238 == 1) {
                this.field1202 = (DataInputStream) this.field1201.field2242;
                this.field1207 = 1;
            }
        }
        if (this.field1207 == 1) {
            this.field1200 += this.field1202.read(this.field1205, this.field1200, this.field1205.length - this.field1200);
            if (this.field1200 == 4) {
                int var1 = (new class174(this.field1205)).method2803();
                this.field1204 = new byte[var1];
                this.field1207 = 2;
            }
        }
        if (this.field1207 == 2) {
            this.field1206 += this.field1202.read(this.field1204, this.field1206, this.field1204.length - this.field1206);
            if (this.field1206 == this.field1204.length) {
                return this.field1204;
            }
        }
        return null;
    }
}
