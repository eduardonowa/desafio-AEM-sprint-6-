import CustomClasses from './components/DefaultComponents/CustomClasses/CustomClasses'
import Text from './components/DefaultComponents/Text/Text'
import AppPage from './components/Page/AppPage'
import Select from './components/DefaultComponents/Select/Select'
import DefaultHeader from './components/DefaultComponents/DefaultHeader/DefaultHeader'
import Footer from './components/DefaultComponents/Footer/Footer'
import Image from './components/DefaultComponents/Image/Image'
import Main from './components/DefaultComponents/Main/Main'
import Title from './components/micro/Title/Title'
import Buttons from './components/micro/Buttons/Buttons'
import Description from './components/micro/Description/Description'
import CheckBox from './components/CheckBox/CheckBox'
import Texts from './components/micro/Texts/Texts'
import Birthday from './components/containers/Birthday/Birthday'
import Error404 from './components/Error404/Error404'
import Menu from './components/Menu/Menu'
import Inputs from './components/Inputs/Inputs'
import Social from './components/containers/Tabs/Social/Social'
import Success from './components/containers/Tabs/Success/Success'
import Basic from './components/containers/Tabs/Basic/Basic'
import Certificates from './components/containers/Tabs/Certificates/Certificates'
import Header from './components/containers/Header/Header'
import Tabs from './components/containers/Tabs/Tabs'
import Home from './components/containers/Home'
import {
  withComponentMappingContext,
  AllowedComponentsContainer,
  MapTo
} from '@mavice/aem-vue-editable-components'

MapTo('vue/components/page')(withComponentMappingContext(AppPage))

// Custom EditConfig for General New Vue Components
const EditConfig = {
  emptyLabel: 'Empty',

  isEmpty: function (props) {
    return !props
  }
}
/** *******************************************************************
              ↓  NEW COMPONENTS MAPPING COME HERE  ↓
**********************************************************************/

// Home Component Mapping
MapTo('vue/components/home-red')(Home, EditConfig)

// Header Component Mapping
MapTo('vue/components/header-red')(Header, EditConfig)

// Tabs Component Mapping
MapTo('vue/components/tabs-red')(Tabs, EditConfig)

// Basic Component Mapping
MapTo('vue/components/basic-red')(Basic, EditConfig)

// Success Component Mapping
MapTo('vue/components/success-red')(Success, EditConfig)

// Social Component Mapping
MapTo('vue/components/social-red')(Social, EditConfig)

// Certificates Component Mapping
MapTo('vue/components/certificates-red')(Certificates, EditConfig)

// Error404 Component Mapping
MapTo('vue/components/error404-red')(Error404, EditConfig)

// Checkbox Component Mapping
MapTo('vue/components/checkbox-red')(CheckBox, EditConfig)

// Description Component Mapping
MapTo('vue/components/description-red')(Description, EditConfig)

// Birthday Component Mapping
MapTo('vue/components/birthday-red')(Birthday, EditConfig)

// Buttons Component Mapping
MapTo('vue/components/buttons-red')(Buttons, EditConfig)

// Menu Component Mapping
MapTo('vue/components/menu-red')(Menu, EditConfig)

// Title Component Mapping
MapTo('vue/components/title-red')(Title, EditConfig)

// Input Component Mapping
MapTo('vue/components/inputs-red')(Inputs, EditConfig)

MapTo('vue/components/customclasses')(CustomClasses, EditConfig)

// Select Component Mapping
MapTo('vue/components/select')(Select, EditConfig)

// Texts Component Mapping
MapTo('vue/components/text-red')(Texts, EditConfig)

// DefaultHeader Component Mapping
MapTo('vue/components/header')(DefaultHeader, EditConfig)

// Header Component Mapping
MapTo('vue/components/main')(Main, EditConfig)

// Footer Component Mapping
MapTo('vue/components/footer')(Footer, EditConfig)

// Image Component Mapping
MapTo('vue/components/image')(Image, {
  emptyLabel: 'Image',
  isEmpty: function (props) {
    return !props || !props.src || props.src.trim().length < 1
  },
  resourceType: 'vue/components/image'
})

// Text Component Mapping
MapTo('vue/components/text')(Text, {
  emptyLabel: 'Text',

  isEmpty: function (props) {
    return !props || !props.text || props.text.trim().length < 1
  }
})

// Container Component Mapping
MapTo('vue/components/container')(
  withComponentMappingContext(AllowedComponentsContainer),
  {
    emptyLabel: 'Container',

    isEmpty: function (props) {
      return !props || !props.cqItemsOrder || props.cqItemsOrder.length === 0
    }
  }
)
