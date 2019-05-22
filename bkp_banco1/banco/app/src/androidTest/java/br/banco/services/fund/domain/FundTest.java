/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.banco.services.fund.domain;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import br.banco.services.app.utils.ValidatorName;



public class FundTest {

    //haveWords -------------------------------

    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void Com_Caracteres_Especiais_Retorna_False() {
        assertFalse(ValidatorName.haveWords("##"));
    }

    @Test
    public void Com_Letras_Retorna_True() {
        assertTrue(ValidatorName.haveWords("Zeus FUND Name Debentures"));
    }

}