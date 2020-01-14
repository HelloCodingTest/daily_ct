fun watermelon(n: Int): String =
        String(CharArray(n) { i -> if (i % 2 == 0) '수' else '박' })