import CustomClasses from './components/DefaultComponents/CustomClasses/CustomClasses'
import Text from './components/DefaultComponents/Text/Text'
import AppPage from './components/Page/AppPage'
import Checkbox from './components/DefaultComponents/Checkbox/Checkbox'
import Select from './components/DefaultComponents/Select/Select'
import Header from './components/DefaultComponents/Header/Header'
import Footer from './components/DefaultComponents/Footer/Footer'
import Image from './components/DefaultComponents/Image/Image'
import Main from './components/DefaultComponents/Main/Main'
import Title from './components/micro/Title/Title'
import Buttons from './components/micro/Buttons/Buttons'
import Description from './components/micro/Description/Description'
import CheckBox from './components/micro/CheckBox/CheckBox'
import Texts from './components/micro/Texts/Texts'
import Birthday from './components/container/Birthday/Birthday'
import Menu from './components/Menu/Menu'
import Inputs from './components/Inputs/Inputs'
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

// Checkbox Component Mapping
MapTo('vue/components/checkbox')(Checkbox, EditConfig)

// Header Component Mapping
MapTo('vue/components/header')(Header, EditConfig)

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
