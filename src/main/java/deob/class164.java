package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fu")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fu.n")
    public InputStream field2199;

    @ObfuscatedName("fu.v")
    public OutputStream field2200;

    @ObfuscatedName("fu.y")
    public Socket field2195;

    @ObfuscatedName("fu.r")
    public boolean field2198 = false;

    @ObfuscatedName("fu.h")
    public class157 field2197;

    @ObfuscatedName("fu.d")
    public class156 field2194;

    @ObfuscatedName("fu.s")
    public byte[] field2196;

    @ObfuscatedName("fu.b")
    public int field2202 = 0;

    @ObfuscatedName("fu.e")
    public int field2201 = 0;

    @ObfuscatedName("fu.f")
    public boolean field2193 = false;

    @ObfuscatedName("fu.z")
    public final int field2203;

    @ObfuscatedName("fu.u")
    public final int field2204;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2197 = arg1;
        this.field2195 = arg0;
        this.field2203 = arg2;
        this.field2204 = arg2 - 100;
        this.field2195.setSoTimeout(30000);
        this.field2195.setTcpNoDelay(true);
        this.field2195.setReceiveBufferSize(65536);
        this.field2195.setSendBufferSize(65536);
        this.field2199 = this.field2195.getInputStream();
        this.field2200 = this.field2195.getOutputStream();
    }

    @ObfuscatedName("fu.s(B)V")
    public void method2826() {
        if (this.field2198) {
            return;
        }
        synchronized (this) {
            this.field2198 = true;
            this.notifyAll();
        }
        if (this.field2194 != null) {
            while (this.field2194.field2145 == 0) {
                class193.method980(1L);
            }
            if (this.field2194.field2145 == 1) {
                try {
                    ((Thread) this.field2194.field2151).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2194 = null;
    }

    public void finalize() {
        this.method2826();
    }

    @ObfuscatedName("fu.r(I)I")
    public int method2809() throws IOException {
        return this.field2198 ? 0 : this.field2199.read();
    }

    @ObfuscatedName("fu.y(I)I")
    public int method2816() throws IOException {
        return this.field2198 ? 0 : this.field2199.available();
    }

    @ObfuscatedName("fu.v(II)Z")
    public boolean method2810(int arg0) throws IOException {
        if (this.field2198) {
            return false;
        }
        try {
            return this.field2199.available() >= arg0;
        } catch (IOException var3) {
            throw new IOException("Error reading from clientstream", var3);
        }
    }

    @ObfuscatedName("fu.h([BIII)I")
    public int method2813(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2198) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2199.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fu.ad([BIII)V")
    public void method2856(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2198) {
            return;
        }
        if (this.field2193) {
            this.field2193 = false;
            throw new IOException();
        }
        if (this.field2196 == null) {
            this.field2196 = new byte[this.field2203];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2196[this.field2201] = arg0[arg1 + var5];
                this.field2201 = (this.field2201 + 1) % this.field2203;
                if ((this.field2204 + this.field2202) % this.field2203 == this.field2201) {
                    throw new IOException();
                }
            }
            if (this.field2194 == null) {
                this.field2194 = this.field2197.method2782(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2202 == this.field2201) {
                            if (this.field2198) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2202;
                        if (this.field2201 >= this.field2202) {
                            var4 = this.field2201 - this.field2202;
                        } else {
                            var4 = this.field2203 - this.field2202;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2200.write(this.field2196, var3, var4);
                    } catch (IOException var12) {
                        this.field2193 = true;
                    }
                    this.field2202 = (this.field2202 + var4) % this.field2203;
                    try {
                        if (this.field2202 == this.field2201) {
                            this.field2200.flush();
                        }
                    } catch (IOException var11) {
                        this.field2193 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2199 != null) {
                        this.field2199.close();
                    }
                    if (this.field2200 != null) {
                        this.field2200.close();
                    }
                    if (this.field2195 != null) {
                        this.field2195.close();
                    }
                } catch (IOException var10) {
                }
                this.field2196 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method4721((String) null, var15);
        }
    }

    @ObfuscatedName("fu.d([BIII)V")
    public void method2811(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2856(arg0, arg1, arg2);
    }
}
