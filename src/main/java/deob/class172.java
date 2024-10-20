package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fq")
public final class class172 extends class305 implements Runnable {

    @ObfuscatedName("fq.u")
    public InputStream field2077;

    @ObfuscatedName("fq.f")
    public OutputStream field2067;

    @ObfuscatedName("fq.b")
    public Socket field2072;

    @ObfuscatedName("fq.g")
    public boolean field2069 = false;

    @ObfuscatedName("fq.z")
    public class167 field2070;

    @ObfuscatedName("fq.p")
    public class166 field2071;

    @ObfuscatedName("fq.h")
    public byte[] field2068;

    @ObfuscatedName("fq.y")
    public int field2075 = 0;

    @ObfuscatedName("fq.w")
    public int field2074 = 0;

    @ObfuscatedName("fq.i")
    public boolean field2073 = false;

    @ObfuscatedName("fq.k")
    public final int field2076;

    @ObfuscatedName("fq.x")
    public final int field2066;

    public class172(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2070 = arg1;
        this.field2072 = arg0;
        this.field2076 = arg2;
        this.field2066 = arg2 - 100;
        this.field2072.setSoTimeout(30000);
        this.field2072.setTcpNoDelay(true);
        this.field2072.setReceiveBufferSize(65536);
        this.field2072.setSendBufferSize(65536);
        this.field2077 = this.field2072.getInputStream();
        this.field2067 = this.field2072.getOutputStream();
    }

    @ObfuscatedName("fq.u(B)V")
    public void method3243() {
        if (this.field2069) {
            return;
        }
        synchronized (this) {
            this.field2069 = true;
            this.notifyAll();
        }
        if (this.field2071 != null) {
            while (this.field2071.field2027 == 0) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var6) {
                }
            }
            if (this.field2071.field2027 == 1) {
                try {
                    ((Thread) this.field2071.field2029).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2071 = null;
    }

    public void finalize() {
        this.method3243();
    }

    @ObfuscatedName("fq.f(B)I")
    public int method3253() throws IOException {
        return this.field2069 ? 0 : this.field2077.read();
    }

    @ObfuscatedName("fq.b(B)I")
    public int method3249() throws IOException {
        return this.field2069 ? 0 : this.field2077.available();
    }

    @ObfuscatedName("fq.g(II)Z")
    public boolean method3267(int arg0) throws IOException {
        if (this.field2069) {
            return false;
        } else {
            return this.field2077.available() >= arg0;
        }
    }

    @ObfuscatedName("fq.z([BIIB)I")
    public int method3247(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2069) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2077.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fq.p([BIIB)V")
    public void method3242(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2069) {
            return;
        }
        if (this.field2073) {
            this.field2073 = false;
            throw new IOException();
        }
        if (this.field2068 == null) {
            this.field2068 = new byte[this.field2076];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2068[this.field2074] = arg0[arg1 + var5];
                this.field2074 = (this.field2074 + 1) % this.field2076;
                if ((this.field2075 + this.field2066) % this.field2076 == this.field2074) {
                    throw new IOException();
                }
            }
            if (this.field2071 == null) {
                this.field2071 = this.field2070.method3206(this, 3);
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
                        if (this.field2075 == this.field2074) {
                            if (this.field2069) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2075;
                        if (this.field2074 >= this.field2075) {
                            var4 = this.field2074 - this.field2075;
                        } else {
                            var4 = this.field2076 - this.field2075;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2067.write(this.field2068, var3, var4);
                    } catch (IOException var12) {
                        this.field2073 = true;
                    }
                    this.field2075 = (this.field2075 + var4) % this.field2076;
                    try {
                        if (this.field2075 == this.field2074) {
                            this.field2067.flush();
                        }
                    } catch (IOException var11) {
                        this.field2073 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2077 != null) {
                        this.field2077.close();
                    }
                    if (this.field2067 != null) {
                        this.field2067.close();
                    }
                    if (this.field2072 != null) {
                        this.field2072.close();
                    }
                } catch (IOException var10) {
                }
                this.field2068 = null;
                break;
            }
        } catch (Exception var15) {
            class341.method3640((String) null, var15);
        }
    }

    @ObfuscatedName("fq.h([BIII)V")
    public void method3250(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3242(arg0, arg1, arg2);
    }
}
