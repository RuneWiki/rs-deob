package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("by")
public class class78 {

    @ObfuscatedName("by.d")
    public int field1186;

    @ObfuscatedName("by.q")
    public class154 field1185;

    @ObfuscatedName("by.x")
    public DataInputStream field1183;

    @ObfuscatedName("by.y")
    public byte[] field1184 = new byte[4];

    @ObfuscatedName("by.e")
    public int field1182;

    @ObfuscatedName("by.f")
    public byte[] field1187;

    @ObfuscatedName("by.v")
    public int field1181;

    @ObfuscatedName("by.t")
    public long field1188;

    public class78(class155 arg0, URL arg1) {
        this.field1185 = arg0.method2684(arg1);
        this.field1186 = 0;
        this.field1188 = class176.method3746() + 30000L;
    }

    @ObfuscatedName("by.d(I)[B")
    public byte[] method1388() throws IOException {
        if (class176.method3746() > this.field1188) {
            throw new IOException();
        }
        if (this.field1186 == 0) {
            if (this.field1185.field2197 == 2) {
                throw new IOException();
            }
            if (this.field1185.field2197 == 1) {
                this.field1183 = (DataInputStream) this.field1185.field2205;
                this.field1186 = 1;
            }
        }
        if (this.field1186 == 1) {
            this.field1182 += this.field1183.read(this.field1184, this.field1182, this.field1184.length - this.field1182);
            if (this.field1182 == 4) {
                int var1 = (new class174(this.field1184)).method2935();
                this.field1187 = new byte[var1];
                this.field1186 = 2;
            }
        }
        if (this.field1186 == 2) {
            this.field1181 += this.field1183.read(this.field1187, this.field1181, this.field1187.length - this.field1181);
            if (this.field1181 == this.field1187.length) {
                return this.field1187;
            }
        }
        return null;
    }
}
