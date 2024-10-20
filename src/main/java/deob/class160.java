package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fq")
public final class class160 implements Runnable {

    @ObfuscatedName("fq.a")
    public InputStream field2271;

    @ObfuscatedName("fq.j")
    public OutputStream field2272;

    @ObfuscatedName("fq.n")
    public Socket field2262;

    @ObfuscatedName("fq.r")
    public boolean field2263 = false;

    @ObfuscatedName("fq.v")
    public class155 field2264;

    @ObfuscatedName("fq.e")
    public class154 field2265;

    @ObfuscatedName("fq.l")
    public byte[] field2266;

    @ObfuscatedName("fq.s")
    public int field2267 = 0;

    @ObfuscatedName("fq.w")
    public int field2268 = 0;

    @ObfuscatedName("fq.p")
    public boolean field2269 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2264 = arg1;
        this.field2262 = arg0;
        this.field2262.setSoTimeout(30000);
        this.field2262.setTcpNoDelay(true);
        this.field2262.setReceiveBufferSize(16384);
        this.field2262.setSendBufferSize(16384);
        this.field2271 = this.field2262.getInputStream();
        this.field2272 = this.field2262.getOutputStream();
    }

    @ObfuscatedName("fq.a(I)V")
    public void method2719() {
        if (this.field2263) {
            return;
        }
        synchronized (this) {
            this.field2263 = true;
            this.notifyAll();
        }
        if (this.field2265 != null) {
            while (this.field2265.field2221 == 0) {
                class182.method318(1L);
            }
            if (this.field2265.field2221 == 1) {
                try {
                    ((Thread) this.field2265.field2225).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2265 = null;
    }

    public void finalize() {
        this.method2719();
    }

    @ObfuscatedName("fq.j(B)I")
    public int method2720() throws IOException {
        return this.field2263 ? 0 : this.field2271.read();
    }

    @ObfuscatedName("fq.n(I)I")
    public int method2721() throws IOException {
        return this.field2263 ? 0 : this.field2271.available();
    }

    @ObfuscatedName("fq.r([BIII)V")
    public void method2731(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2263) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2271.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fq.v([BIII)V")
    public void method2733(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2263) {
            return;
        }
        if (this.field2269) {
            this.field2269 = false;
            throw new IOException();
        }
        if (this.field2266 == null) {
            this.field2266 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2266[this.field2268] = arg0[arg1 + var5];
                this.field2268 = (this.field2268 + 1) % 5000;
                if ((this.field2267 + 4900) % 5000 == this.field2268) {
                    throw new IOException();
                }
            }
            if (this.field2265 == null) {
                this.field2265 = this.field2264.method2677(this, 3);
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
                        if (this.field2268 == this.field2267) {
                            if (this.field2263) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2267;
                        if (this.field2268 >= this.field2267) {
                            var4 = this.field2268 - this.field2267;
                        } else {
                            var4 = 5000 - this.field2267;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2272.write(this.field2266, var3, var4);
                    } catch (IOException var12) {
                        this.field2269 = true;
                    }
                    this.field2267 = (this.field2267 + var4) % 5000;
                    try {
                        if (this.field2268 == this.field2267) {
                            this.field2272.flush();
                        }
                    } catch (IOException var11) {
                        this.field2269 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2271 != null) {
                        this.field2271.close();
                    }
                    if (this.field2272 != null) {
                        this.field2272.close();
                    }
                    if (this.field2262 != null) {
                        this.field2262.close();
                    }
                } catch (IOException var10) {
                }
                this.field2266 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method683((String) null, var15);
        }
    }
}
